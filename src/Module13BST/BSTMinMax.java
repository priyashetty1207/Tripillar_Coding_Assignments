package Module13BST;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int value) {
        data = value;
    }
}

public class BSTMinMax {
    Node2 root;

    int findMin(Node2 root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    int findMax(Node2 root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();

        tree.root = new Node2(50);
        tree.root.left = new Node2(30);
        tree.root.right = new Node2(70);
        tree.root.left.left = new Node2(20);
        tree.root.right.right = new Node2(80);

        System.out.println("Minimum: " + tree.findMin(tree.root));
        System.out.println("Maximum: " + tree.findMax(tree.root));
    }
}