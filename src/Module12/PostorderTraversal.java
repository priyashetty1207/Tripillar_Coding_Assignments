package Module12;

public class PostorderTraversal {
    Node root;

    void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
}