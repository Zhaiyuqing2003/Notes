// FixedCapacityOfStrings
public class Q1<Item> {
    private int N = 0;
    private Item[] list;
    
    Q1(int cap){
        this.list = (Item[]) new Object[cap];
    };

    public boolean isEmpty(){
        return this.N == 0;
    }

    public int size(){
        return this.N;
    }

    public void push(Item item){
        this.list[this.N++] = item;
    }

    public Item pop(){
        return this.list[--this.N];
    }
    
    public boolean isFull(){
        return this.list.length == this.N;
    }
}
