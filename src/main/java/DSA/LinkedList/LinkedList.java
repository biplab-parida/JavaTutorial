package DSA.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head==null)
            tail=null;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLast = getByIndex(size-2);
        int val = tail.data;
        tail=secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if (index == size-1){
            deleteLast();
        }
        Node prev = getByIndex(index -1);
        int val = prev.next.data;
        prev.next = prev.next.next;

        return val;

    }


    public Node getByIndex(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;

    }

    public Node getByValue(int val){
        Node node = head;
        while(node.next !=null){
            if(node.data == val)
                return node;
            node = node.next;
        }
        return null; // if value is not found
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    class Node {
        int data;         // Data stored in the node
        Node next;        // Reference to the next node in the linked list

        // Constructor
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        LinkedList ll = new LinkedList();
        for(int i : arr){
            ll.insertFirst(i);
        }
        ll.insertLast(88);
        ll.display();
    }
}
