package Module10;

public class CountNodes {
    Node head;

    int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Number of nodes: " + list.count());
    }
}
