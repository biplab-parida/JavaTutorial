package DSA.LinkedList;

public class ReverseLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive reverse function
    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            head = node;  // update head to the new front
            return node;
        }

        Node newHead = reverse(node.next);  // reverse rest of list

        node.next.next = node;  // point next node's next to current
        node.next = null;       // break current node's old link

        return newHead;
    }

    public Node reverse1(Node head){
        if(head == null){
            return head;
        }

        Node prev = null;
        Node present = head;

        while(present !=null){
            Node next = present.next;
            present.next=prev;
            prev = present;
            present = next;
        }
        this.head=prev;
    return prev;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original List:");
        list.printList();

//        list.reverse(list.head);
        list.reverse1(list.head);
        System.out.println("Reversed List:");
        list.printList();
    }
}
