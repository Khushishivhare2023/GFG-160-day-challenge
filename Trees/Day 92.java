/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private Node first = null, second = null, prev = null;
    void correctBST(Node root) {
        inorder(root);
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }
    private void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        if (prev != null && node.data < prev.data) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;

        inorder(node.right);
    }
}
