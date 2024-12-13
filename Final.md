# CS 423 Midterm (Fall 2024)

**Tips:**

- **You are expected to do the exam** **independently****.** No discussion is allowed – **don’t cheat**. If you are harassed by someone for forceful discussion, please let the instructors know and they will handle it.
- **You are NOT supposed to use ChatGPT.** Certainly, we can’t track you. Note that ChatGPT could be wrong in certain patterns and we will check it. 
- **Please type your answers instead of handwriting them.** Note that your presentation does matter. If we can’t understand your writing, then we won’t give points. We won’t guess anything beyond what you write. 
- Give **short, concise answers** rather than long, vague ones (we grade by correctness, not by length). 
- **Some problems need writing code, executing it on your own machine (which you use for writing MPs), and reporting the results.** It’s a feature, not a bug. 
- If you find that you have to make assumptions to solve problems, write them down (e.g., “I assume this is an `x86` architecture” or “I assume a Linux kernel version `>2.6.3`”). Most problems are kept at a high level and do not need specific assumptions. 
- **No late submission is allowed. **

| **Sections (40 points)**      | **Points** |
| :---------------------------- | ---------- |
| MP-1 Continued (10 points)    |            |
| MP-1 Continued (10 points)    |            |
| CPU Scheduling (10 points)    |            |
| Memory Management (10 points) |            |

<center style="font-size: 1.25em">
    <strong>Name: <u>&nbsp;&nbsp;Yuqing Zhai&nbsp;&nbsp;</u></strong>
    <span style="margin: 0 1.5em;"></span>
    <strong>NetID: <u>&nbsp;&nbsp;yuqing9&nbsp;&nbsp;</u></strong>
</center>


<div name="page-break"></div>

## 1. MP-2 Continued (10 points)

In MP2 we implemented a rate monotonic scheduler (RMS). RMS uses a static scheduling algorithm because priority (1/`period`) is assigned to each task once and for all. There exists another scheduling algorithm that can achieve higher CPU utilization called Deadline Driven scheduling (DDS) algorithm, which assigns priority to tasks in a dynamic fashion.

Using DDS, A task will be assigned the highest priority if the deadline of its current request is the nearest, and will be assigned the lowest priority if the deadline of its current request is the furthest. At any instant, the task with the highest priority and yet unfulfilled request will be executed.

Your task for this problem is to implement a DDS with MP2’s framework.

### (1)

Which part of the MP2 framework needs to be changed to implement DDS? Just describe which part. Don’t describe how to change and don’t write code, which is the task for next question. (2pt)

>We need to change algorithm that decides the highest priority task. To do so we need to save the `deadline` of each registered process and update them, so we could use them to in our algorithm.

### (2)

Finish the dispatch thread implementation for DDS. Starting code is provided, please fill the TODO part in `dispatch_fn()`. You need to write code in C style. (5pt)

Here the **`head`** is a link list of **`mp2_task_struct`** that stores all the tasks that have registered with the scheduler. You can introduce other local or global variables if you want.

You can assume the tasks registered have all passed admission control (though the admission criteria for DDS is different from RMS) and you don’t need to consider the case where a task misses its deadline.

All the other parts (registration, yield, de-registration, timer handler, etc.) are the same as what you implemented in MP2, and **the periodic application behaves in the same way as that in MP2**.

```c
enum proc_state { READY, RUNNING, SLEEPING };

static DEFINE_SPINLOCK(mp2_spinlock);
static LIST_HEAD(mp2_task_list);
struct mp2_task_struct {
    struct list_head node;
    pid_t pid;
    unsigned long period;    // in ms
    unsigned long comp_time; // in ms
    unsigned long deadline;  // in jiffies
    enum proc_state state;
    struct timer_list wakeup_timer;
    struct task_struct* linux_task;
}

struct mp2_task_struct *mp2_current_task;

// helper function: find task with earlist deadline
struct mp2_task_struct *_mp2_find_highest_ready_task(void) {
  struct mp2_task_struct *task_struct, *earlist_task = NULL;
  unsigned long earliest_deadline = ULONG_MAX;

  list_for_each_entry(task_struct, &mp2_task_list, list) {
    if (task_struct->state != READY) {
      continue;
    }

    if (task_struct->info.deadline < earliest_deadline) {
      earlist_task = task_struct;
      earliest_deadline = task_struct->info.deadline;
    }
  }

  return earlist_task;
}

void dispatch_fn() {
    unsigned long flags;
    
    set_current_state(TASK_INTERRUPTIBLE);
    schedule();
    
    while (!kthread_should_stop()) {
        // enter criticl section
       	spin_lock_irqsave(&mp2_spinlock, flags);
        highest_ready_task = _mp2_find_highest_ready_task();

        // if no ready task, no scheduling needed
        if (highest_ready_task == NULL) {
            // current task finished, set to NULL
            if (
                (mp2_current_task) != NULL &&
                (mp2_current_task)->state == SLEEPING
            ) {
                mp2_current_task = NULL;
            }

            goto WAIT;
        }

        // do not preempt yourself, otherwise
        // you will waste time
        if (mp2_current_task != NULL) {
            if (mp2_current_task->info.pid == highest_ready_task->info.pid) {
                goto WAIT;
            }
        }

        // if ready task are not higher than current
        // task, do not preempt
        if (mp2_current_task != NULL && mp2_current_task->state == RUNNING) {
            if (!(highest_ready_task->info.deadline < mp2_current_task->info.deadline)) {
                goto WAIT;
            }
        }

        // otherwise try preempt current task, and
        // switch to highest ready task
        _mp2_preempt(mp2_current_task);
        _mp2_context_switch(highest_ready_task);

WAIT:
        // exit critical section
        spin_unlock_irqrestore(&mp2_spinlock, flags);
        set_current_state(TASK_INTERRUPTIBLE);
        schedule();
    }
}
```

Few things to notice. I would assume that the list structure is protected by a spinlock called `mp2_spinlock`, and instead of using `HEAD`, I am using a global variable called `mp2_task_list` as head, and I have a variable `mp2_current_task` to track the current task. I have created a helper function called `_mp2_find_highest_ready_task`, which finds the ready task with highest priority. **The only changes is in line 28 and 72**: where it is previous compared between `period` but now between `deadline`. Other lines are the same as my `mp2` implementation.

### (3)

temporary



## 2. MP-3 Continued (10 points)

While your TA Siyuan is working on MP3, he finds that the overall page fault stats can not tell the performance of a specific application. He wants to allocate an individual buffer per process to track every application’s page fault rate. He wants the work program to do everything as it is doing right now, but call `mmap ` syscall before deregistration to get the profiled page fault and utilization statistics. 

In his setup, he wants the buffer be allocated at registration time, and deallocated at deregistration time. The size of buffer is kept at `128 * 4KB`. The profiling rate stays at `20 HZ`. Each time the profiling `workqueue` is triggered, it will write four unsigned long values into the buffer of each registered process 1) current jiffies, 2) # of minor page faults since last buffer update time, 3) # of major page faults since last buffer update time, 4) CPU utilization  (`s_time + u_time`) since buffer update time.

Since Siyuan is too busy with his paper submissions, would you mind helping him implement this feature? 





## 3. Kernel Extension Programming (10 points)









## 4. Virtualization (10 points)

We have discussed memory management in the OS running on bare metal. Now, let’s discuss memory management in virtualized environments such as modern cloud environments (e.g., an EC2 virtual machine running on AWS’s hypervisor). Modern hardware architectures are equipped with memory virtualization features so the MMU can walk over the guest and host page tables upon TLB misses. 

### (1)

We learned in the class that on the `x86-64` architecture, upon a TLB miss, a nested translation takes a two-dimensional page table walk. How many memory accesses does it take in the worst case? Please illustrate the process and mark clearly which are in the guest and what are in the host. (2 point)

>In `x86-64`, 

### (2)

To reduce the cost of the nested translation, our ex-TA Jiyuan proposes to use Huge Pages because Huge Pages can not only improve TLB coverage but also reduce page table walks. So, he comes up with the mechanism in the hypervisor which ensures that guest page tables are *always* allocated as 1GB huge pages in the host. So, with this approach, how many memory accesses does a nested translation take in the worst case? Please illustrate the process as in (1) (2 points) 

### (3)

Let’s implement Jiyuan’s approach on Linux. Can you describe what code needs to be changed and in which way – essentially how to make sure guest page tables are allocated in huge pages at the host? (2 points)

### (4)

Can you describe one scenario in which this approach does not work well, besides the potential internal fragmentation? (1 point)

### (5)

Now, with the new system, how does the Page Fault Handler work? Please describe the page fault handling process triggered by the user application in the guest. Please make clear what happens in the guest and in the host. (2 points)

### (6)

What are Jiyuan’s approach’s implications on the page fault handling, compared to vanilla Linux? (1 point)