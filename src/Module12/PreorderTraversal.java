package Module12;

public class PreorderTraversal {
    Node root;

    void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
    }
}
