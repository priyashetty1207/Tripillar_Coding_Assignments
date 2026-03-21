package Module13BST;
class Node4 {
    int data;
    Node4 left, right;

    Node4(int value) {
        data = value;
    }
}

public class CheckBST {
    Node4 root;

    boolean isBST(Node4 root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();

        tree.root = new Node4(50);
        tree.root.left = new Node4(30);
        tree.root.right = new Node4(70);

        boolean result = tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println("Is valid BST: " + result);
    }
}