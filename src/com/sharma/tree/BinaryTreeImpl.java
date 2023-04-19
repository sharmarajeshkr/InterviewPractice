package com.sharma.tree;

public class BinaryTreeImpl {
    static Node root;

    private Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);

        if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    public void add(int value) {
        root = insert(root, value);
    }

    // This method mainly calls InorderRec()
    void treeOrder(String order) {
        if (order.trim().equalsIgnoreCase("in"))
            inorderRec(root);
        else if (order.trim().equalsIgnoreCase("pre"))
            preorderRec(root);
        else if (order.trim().equalsIgnoreCase("post"))
            postorderRec(root);

    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // A utility function to do inorder traversal of BST
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

    void postorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    private boolean search(Node root, int key) {
        boolean res = false;
        if (root == null)
            return false;
        if (root.data == key)
            return true;

        else if (key < root.data)
            res = search(root.left, key);
        else if (key > root.data)
            res = search(root.right, key);
        return res;
    }

    private int minValue(Node root) {
        int minvalue = root.data;
        while (root.left != null) {
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;
    }

    private int maxValue(Node root) {
        int maxvalue = root.data;
        while (root.right != null) {
            maxvalue = root.right.data;
            root = root.right;
        }
        return maxvalue;
    }


    private Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = delete(root.right, key);

        }
        return root;

    }

    public static void main(String[] args) {
        BinaryTreeImpl tree = new BinaryTreeImpl();
        /*
         * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
         */

        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);

        // tree.traverseInOrder(root);

        tree.treeOrder("in");
        System.out.println("In  Order End");

        tree.treeOrder("pre");
        System.out.println("Pre  Order End");

        tree.treeOrder("post");
        System.out.println("Post  Order End");

        System.out.println("Search Elements");
        boolean res = tree.search(root, 20);
        System.out.println(res);

        System.out.println("Min Value " + tree.minValue(root));

        System.out.println("Max Value " + tree.maxValue(root));

        int n = 40;
        System.out.println("Delete Value " + n);
        tree.delete(root, n);

        tree.treeOrder("in");
        System.out.println("In  Order End");
    }

}
