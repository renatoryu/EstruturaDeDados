package dataStructure;

public class Stack {
    
    private Node top;
    private int height;

    public class Node{
        int value;
        Node next;


        Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop(){
        if (top == null){
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo da Pilha: " + top.value);
        }
    }

    public void getHeight(){
        System.out.println("Altura da Pilha: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == value) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp = null;
        height--;

        return temp;
    }

    public void print(){
        System.out.println("########################");
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("########################");
    }
}
