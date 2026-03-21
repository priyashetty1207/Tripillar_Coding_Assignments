package Module12;

public class TreeHeight {
    Node root;

    int height(Node node) {
        if (node == null)
            return -1; // or 0 depending on definition

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeHeight tree = new TreeHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("Height of tree: " + tree.height(tree.root));
    }
}