import java.util.HashMap;
import java.util.*;

public class BinaryTree{
    protected class Node{
        protected Object value;
        protected Node right;
        protected Node left;
        Node(Object setValue){
            value = setValue;
        }
    }
    protected Node root;
}


class YourBinaryTree extends BinaryTree{
    protected Map<Object, Integer> valueCount(){
        Map<Object, Integer> countMap = new HashMap();
        
        if (this.root == null){
            return countMap;
        }
        
    }
    
    private Node[] valueCount(Node current){
        if (current == null){
            return new Node[] {};
        } 
    }
}
