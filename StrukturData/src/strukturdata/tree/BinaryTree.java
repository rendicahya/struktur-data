package tree;

import queue.linkedlist.LinkedListQueue;

public class BinaryTree {

    private final Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public String preOrder() {
        var result = new StringBuilder();

        preOrder(root, result);

        return result.toString();
    }

    private void preOrder(Node node, StringBuilder result) {
        if (node == null) {
            return;
        }

        result.append(node.data);
        preOrder(node.left, result);
        preOrder(node.right, result);
    }

    public String inOrder() {
        var result = new StringBuilder();

        inOrder(root, result);

        return result.toString();
    }

    private void inOrder(Node node, StringBuilder result) {
        if (node == null) {
            return;
        }

        inOrder(node.left, result);
        result.append(node.data);
        inOrder(node.right, result);
    }

    public String postOrder() {
        var result = new StringBuilder();

        postOrder(root, result);

        return result.toString();
    }

    private void postOrder(Node node, StringBuilder result) {
        if (node == null) {
            return;
        }

        postOrder(node.left, result);
        postOrder(node.right, result);
        result.append(node.data);
    }

    public String levelOrder() {
        if (root == null) {
            return "";
        }

        var queue = new LinkedListQueue();
        var result = new StringBuilder();

        queue.enqueue(root);
        result.append(root.data);

        while (!queue.isEmpty()) {
            var node = (Node) queue.dequeue();

            if (node.left != null) {
                result.append(node.left.data);
                queue.enqueue(node.left);
            }

            if (node.right != null) {
                result.append(node.right.data);
                queue.enqueue(node.right);
            }
        }

        return result.toString();
    }
}
