package congestion.calculator;

public class Linked {

    static Node head;

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null) {
            next = current.next; // next = 2 poniter
            current.next = prev; // currnet = 1  = null
            prev = current;  // prev = 1 
            current = next;  // current = 2
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Linked list = new Linked();
        Linked.head = new Node(1);
        Linked.head.next = new Node(2);
        Linked.head.next.next = new Node(3);
        Linked.head.next.next.next = new Node(4);

        System.out.println("Linked List : ");
        list.printList(head);
        System.out.println();
        head = list.reverse(head);
        list.printList(head);
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


// Linked List = 1 2 3 4 