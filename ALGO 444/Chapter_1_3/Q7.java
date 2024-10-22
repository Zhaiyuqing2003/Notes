public class Q7<Item>{
    private class Node{
        public Item item;
        public Node next;
    }

    private Node first;
    private int N;

    Q7(){};

    public void push(Item item){
        Node oldFirst = this.first;
        this.first = new Node();
        
        this.first.item = item;
        this.first.next = oldFirst;

        this.N += 1;
    }
    public Item pop(){
        Item item = this.first.item;
        this.first = this.first.next;
        
        this.N -= 1;
        return item;
    }
    public Item peek(){
        return this.first.item;
    }
    public boolean isEmpty(){
        return this.N == 0;
    }
    public int size(){
        return this.N;
    }
}