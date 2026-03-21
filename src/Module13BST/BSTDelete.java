package Module13BST;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int value) {
        data = value;
    }
}

public class BSTDelete {
    Node3 root;

    int findMin(Node3 root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    Node3 delete(Node3 root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Case 1 & 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3
            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }
        return root;
    }

    void inorder(Node3 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTDelete tree = new BSTDelete();

        tree.root = new Node3(50);
        tree.root.left = new Node3(30);
        tree.root.right = new Node3(70);

        tree.root = tree.delete(tree.root, 50);

        System.out.print("After deletion: ");
        tree.inorder(tree.root);
    }
}
