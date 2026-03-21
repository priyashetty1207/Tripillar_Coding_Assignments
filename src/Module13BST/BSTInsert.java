package Module13BST;

class Node {
    int data;
    Node1 left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTInsert {
    Node1 root;

    Node1 insert(Node1 root, int key) {
        if (root == null) {
            return new Node1(key);
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node1 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTInsert tree = new BSTInsert();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values)
            tree.root = tree.insert(tree.root, val);

        System.out.print("BST Inorder: ");
        tree.inorder(tree.root);
    }
}