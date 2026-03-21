package Module10;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDisplay {
    Node head;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListDisplay list = new LinkedListDisplay();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.display();
    }
}