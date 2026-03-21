package Module13BST;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
    }
}

public class BSTSearch {
    Node1 root;

    boolean search(Node1 root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BSTSearch tree = new BSTSearch();

        tree.root = new Node1(50);
        tree.root.left = new Node1(30);
        tree.root.right = new Node1(70);

        int key = 30;
        System.out.println("Found: " + tree.search(tree.root, key));
    }
}