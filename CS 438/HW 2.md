#### Problem 1

query raw result could be found at https://docs.google.com/document/d/1-ipgt5W8nbsQ1SLHDL3E7i3tfycTR0EiHzroNVLFdNk/edit?usp=sharing

I used a computer in the lab in Siebel, and it seems to use IPv6.

##### (a)

```pseudocode
1.
Consult root server for IP of www.eecs.mit.edu
Got TLD NS sever a.edu-servers.net with a IP

name    h.root-servers.net
ip      2001:500:1::53
query   23ms
RTT     21.389ms
TTL     172800s

2.
Consult edu TLD for IP of www.eecs.mit.edu
Got NS server usw2.akam.net, but need to find IP

name    a.edu-servers.net
ip      2001:503:a83e::2:30
query   23ms
RTT     21.902ms
TTL     172800s

3.
Consult root server again for IP of usw2.akam.net
Got TLD NS server a.gtld-servers.net with IP

name    h.root-servers.net
ip      2001:500:1::53
query   23ms
RTT     21.389ms
TTL     172800s

4.
Consult net TLD for IP of usw2.akam.net
Got NS server a18-67.akam.net with IP
(net TLD and edu TLD actually has same IP!)

name    a.gtld-servers.net
ip      2001:503:a83e::2:30
query   23ms
RTT     21.902ms
TTL     172800s

5.
Consult enterprise NS for IP of usw2.akam.net
Got IP 184.26.161.64

name    a18-67.akam.net
ip      2600:1480:4800::43
query   19ms
RTT     22.431ms
TTL     90000s

6.
Consult NS server for IP of www.eecs.mit.edu
Got a CNAME miteecs.wpengine.com

name    a18-67.akam.net
ip      184.26.161.64
query   23ms
RTT     22.549ms
TTL     1800s

7.
Consult root server again for IP of miteecs.wpengine.com
Got TLD NS server a.gtld-servers.net

name    h.root-servers.net
ip      2001:500:1::53
query   23ms
RTT     21.389ms
TTL     172800s

8.
Consult net TLD server for IP of miteecs.wpengine.com
Got enterprise NS server jim.ns.cloudflare.com

name    a.gtld-servers.net
ip      2001:503:a83e::2:30
query   23ms
RTT     21.902ms
TTL     172800s

9.
Consult enterprise NS server jim.ns.cloudflare.com
Got IP 35.231.163.5!

name    a.gtld-servers.net
ip      2606:4700:58::adf5:3b7d
query   7ms
RTT     8.395ms (maybe a fluctuation in the internet?)
TTL     120s
```

##### (b)

It takes `27ms`, it's trivial that this is shorter than the sum of the iterative steps, and it's MUCH faster. The reason is that the DNS server located on our university store this DNS as cache on the server, so it doesn't need request again. (Given that many students have done / are doing the homework, even though it only has a TTL of 120s, it should still be in the cache when I visit it). This cache saves majority of the time that iterative approach needs. In fact, if we just query the our localhost DNS server, we could get ~0ms query time, since it's already in our local cache.

##### (c)

```pseudocode
1.
Consult root server for domain of 5.163.231.35.in-addr.arpa
Got TLD NS sever a.in-addr-servers.arpa with a IP

name    h.root-servers.net
ip      2001:500:1::53
query   19ms
RTT     16.418ms
TTL     172800s

2.
Consult edu TLD for domain of 5.163.231.35.in-addr.arpa
Got NS server x.arin.net without IP

name    a.in-addr-servers.arpa
ip      2620:37:e000::53
query   59ms
RTT     55.856ms
TTL     86400s

3.
Consult root server again for IP of x.arin.net
Got TLD NS server a.gtld-servers.net with IP

name    h.root-servers.net
ip      2001:500:1::53
query   23ms
RTT     16.418ms
TTL     172800s

4.
Consult net TLD for IP of x.arin.net
Got NS server ns1.arin.net with IP
(net TLD and edu TLD actually has same IP!)

name    a.gtld-servers.net
ip      2001:503:a83e::2:30
query   23ms
RTT     22.145ms
TTL     172800s

5.
Consult enterprise NS for IP of x.arin.net
Got IP 199.180.180.63!

name    ns1.arin.net
ip      2001:500:12::108
query   23ms
RTT     22.431ms
TTL     43200s

6.
Consult NS server for domain of 5.163.231.35.in-addr.arpa
Got NS server ns-gce-public1.googledomains.com

name    x.arin.net
ip      199.180.180.63
query   55ms
RTT     53.567ms
TTL     86400s

7.
Consult NS server for domain of 5.163.231.35.in-addr.arpa
Got domain 5.163.231.35.bc.googleusercontent.com. (PTR record)

name    ns-gce-public1.googledomains.com
ip      2001:500:1::53
query   27ms
RTT     21.389ms
TTL     120s
```

##### (d)

As observed, DNS packets range from a few tens to several hundred bytes. When dealing with such small sizes, the additional overhead introduced  by TCP—both in terms of header size and the time required to establish a connection—becomes disproportionately large. Considering that DNS  servers, especially those at the core of the internet, handle a vast  volume of requests, minimizing overhead is crucial. Moreover, the need  for reliability in DNS transactions is relatively low; if a request  fails, the client can simply resend it after a timeout period.  Therefore, to optimize performance, the DNS protocol opts for UDP, which incurs less overhead and suits the quick, transactional nature of DNS  queries.







#### Problem 2

##### (a)

>Suppose that $\mu_s/N \le d\tsub min;$. How would you set the rate $r_c$

In this scenario, we see that the server's per-client capacity is less than or equal to the minimum download rate of the clients. This implies that the server's upload capacity is the limiting factor, not the clients' download capacities.

The optimal strategy is to evenly distribute the server's upload capacity among $N$ clients. (Consider slightly deviate from this strategy, then one client will have slightly less upload capacity assigned to it, while other clients might have more upload capacity. But since in this case the speed is throttled by the server's upload speed, so that one client's download rate will decrease, and that will result in longer time for all clients to finish downloading the file).

So the rates $r_c$ in this case is $\note r_c = \mu_s/N!$. It's trivial that $\sum_{c} r_c \le \mu_s$ in this case. We also see that $r_c = \mu_s/N \le d\tsub min; \le d_c$, so both condition holds.

The distribution time is thus $\note T = F/r_c = F\cdot N/\mu_s!$​ 

##### (b)

 >

The optimal strategy in this case is to let $\note r_c = d\tsub min;!$ (since this is the best, we could do, any rate higher than this will still be capped by the $d\tsub min;$). It's trivial that $\forall_c r_c \le d_c$, and that $\sum_c r_c = Nd\tsub min; < \mu_s$ so two conditions hold.

The distribution time is thus $\note T = F/r_c = F/d\tsub min;!$​

##### (c)

If we apply the previous analysis, we see that in this case $\mu_s/N = 120 / 10 = 12$, and $d\tsub min; = 12$, so $\mu_s/N = d\tsub min;$ and it's the case (a), so we set $r_c = \mu_s/N = 12$. Now if we want to improve the average download time, that means we must decrease the $r_c$ for some clients, and increase it for others, but we see that $r_c = d\tsub min;$ in this case, and any decrease in some client will make the overall total distribution time larger. So, without increasing the total distribution time from previous part, the rates should be $\note 12!$



#### Problem 3

##### (a)

Assume that Bob is not on others' list (he is a free rider anyway), and that he has average chance of being selected (to unchoke). Also assume that each peer uploads at full speed, and the uploading bandwidth is equally divided to five peers (4 on the top list, and one that is chosen to unchoke).

Then we see that for other 30 peers, they need to choose from remaining 26 peers to randomly unchoke one (31 peers in total, exclude oneself and 4 on the top list, so 26 remains), then the chance of being selected is $1/26$, for each case that Bob is selected, he gets $1/5 \cdot 130$ Mbps bandwidth from that peer (since it's evenly distributed). So we see the expected bandwidth would be $130 / (5 \cdot 26) = 1$Mbps. Since we have other 30 peers, so the total expected bandwidth will be $30 \cdot 1 = \note 30 \text{Mbps}!$

##### (b)

Since this peer-to-peer system is not choked by the download speed, and we assume each pair has something to share, so they could share the chunks at full speed, then that means the total upload rate is $30\cdot 130 = 3900$Mbps. Since Bob steals $30$Mbps from the system, we have $3900-30 = 3870$Mbps remains, calculating the average, we see that the average download rate for the remaining peer is $3870/30 = \note 129\text{Mbps} !$.

##### (c)

Now add second free rider into play. We see that there are still only 30 peers that is contributing, and they need to choose from remaining 27 peers to randomly unchoke one (32 peers in total, exclude oneself and 4 on the top list). For each free rider, there are $1/27$ chance to be selected, and could get $1/5 \cdot 30$Mbps bandwidth from the peer. So the expected total bandwidth would be $30 \cdot 130/(5 \cdot 27)$ for each free rider. Since Bob gets two free riders running, in this case we could get $130 \cdot 2 \cdot 30 / (5 \cdot 27)$, this is approximately $\note 57.78\text{Mbps}!$

##### (d)

$\note \text{Yes}!$. Just consider if Bob's client becomes just as normal as other peers ("identical"). Then we see that the average download speed for each peer is $32 \cdot 130 /32 = 130$Mbps for all peers (since Bob's client now behave just like other peers, we could expect its download speed to just as good as the average download speed). Now Bob has total download rate of $130 \cdot 2 = 260$Mbps, which is way faster than the free rider case.

To consider a more concrete example, suppose Bob's both clients get into a peer's top four list. (which is very likely, just contribute all your upload rate to that peer) Then from the peer Bob could first get $26 \cdot 2 = 52$Mbps for both client. Then other client also has a chance of unchoking him, so $29 \cdot 2\cdot (1/27) \cdot (26)\approx 55.85$Mbps. Together $52 + 55.85 \ge 57.78$, and we do see a big improvement even if Bob only gets into one peer's top four list.



#### Problem 4

##### (a)

We see that it uses an 8-bit hash ID, so the hashing ID space is $\sets{0,1, 2, \cdots, 2^8 - 1}$ (start from 0, to 255).

##### (b)

Peer $\note 52!$ stored the key 51, because it immediately follows key 51. Peer $\note 12!$ stores the key 225, because it immediately follows value 225 (in a circular fashion).

##### (c)

The key 22 is stored in the peer $26$, because peer 26 immediately follows the key 22. So, the query looks like

```pseudocode
88 -> 104 (ask)
104 -> 124 (ask)
124 -> 12 (ask)
12 -> 16 (ask)
16 -> 26 (ask)
26 -> 88 (reply)
```

Since each peer only know its clockwise successor. We see that we need 6 messages.

##### (d)

We see key 101 is stored in peer 104, since peer 104 immediately follows the key 101. So the query looks like

```pseudocode
12 -> 26 (ask)
26 -> 73 (ask)
73 -> 104 (ask)
104 -> 12 (reply)
```

We see since we used the cord `12 -> 26`, `26 -> 73`, `73 -> 104`, we shorten the path by a bit, and we need only 4 messages.

##### (e)

We see that the worst case is the peer you want to talk to is just anticlockwise behind you. In this case you need $N$ messages (in this case we have 8 peer, so 8 messages), since you need to go through entire cycle to reach that peer, and for that peer to return the value to you.

We see that the worst case is still the peer you want to talk to is just anticlockwise behind you. For example say you are peer 16 and want to talk to peer 12, then you need to `16 -> 52 -> 88 -> 124 -> 12 -> 16` and this requires 6 messages. 5 messages to go to that peer, and one message for the reply.

##### (f)

<img src="./HW 2.assets/image-20240219221145178.png" alt="image-20240219221145178" style="zoom: 25%;" />

one easy solution is just let each peer also keep a cord to its clockwise predecessor. In this case, the maximum step for any node to reach any peer is $4$. (You could go clockwise or counterclockwise in this case, and it's not hard to see that farthest node has need message $\text{total edge}/2 = 4$ to reach). That peer will then return the value to you, the maximum number of message needed is therefore 5.



#### Problem 5

##### (a)

Servers maintain a unique socket for each client session they communicate with. When establishing a socket, it's necessary to specify both the IP address and the port number for the remote endpoint involved in the communication. This information becomes associated with the socket, as required by the TCP protocol. TCP uniquely identifies and demultiplexes messages using a combination of four key elements: the source IP address, source port number, destination IP address, and destination port number, with the IP addresses being provided by the underlying IP protocol.

Due to the connection-oriented nature of the TCP protocol, which involves a connection establishment phase, the IP address and port number intended for communication are linked to the socket. TCP utilizes this information, matching it against the four-element tuple in each incoming message to accurately demultiplex the data. This process ensures that each socket receives only the data intended for it, enabling the server to efficiently manage multiple connections and ensure that each socket is directed to the correct packet.

 ##### (b)

The HTTP/1.1 said that

>A single-user client SHOULD NOT maintain more than 2 connections with any server or proxy. A proxy SHOULD use up to 2*N connections to another server or proxy, where N is the number of simultaneously active users. These guidelines are intended to improve HTTP response times and avoid congestion.

but this seems to be more of a suggestion than an enforcement. Modern browser each has its own decision to limit number of connection to the same domain. https://docs.diffusiondata.com/cloud/latest/manual/html/designguide/solution/support/connection_limitations.html.

So, for the sake of discussion, let's assume that HTTP and relevant software doesn't impose restriction for now. Then the restriction are from the TCP and IP protocols. Since TCP requires a socket (which is a file descriptor) and a port (which ranges 0-65535). Yet to initiate a connection to the server, the connection will uses ephemeral ports, which range depends on system. For the Linux system I currently have, I could check the maximum number of file descriptor I have using

```shell
ulimit -n
```

which turns out to be 1024 in my case, and I could check the ephemeral ports using

```shell
cat /proc/sys/net/ipv4/ip_local_port_range
```

which turns out to be `32768 - 60999`

In this case, that means the maximum port in spare for connection is `28232`, and I may need to open dozens of process for the connection, since I could only open 1024 file descriptor for a single process. However, this depends on the operating system and underlying hardware, which may vary from machine to machine. Theoretically on the Linux machine, I could modify the kernel to make it use all the ports (65536) for TCP connection. Since the TCP's header only has 16 bit number size to specify the port number. So there is indeed a limitation (65536) for TCP protocol, so the theoretical connection could make is 65536. But usually it's unlikely to be that high and limited by the operating system, and is further limited by the browser, and maybe the firewall and other policies for the server you are connecting to.

