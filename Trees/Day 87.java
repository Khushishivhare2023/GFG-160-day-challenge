/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    static int maxPathSumUtil(Node root, int[] res) {
        if (root == null) return 0;
        int l = Math.max(0, maxPathSumUtil(root.left, res));
        int r = Math.max(0, maxPathSumUtil(root.right, res));
        res[0] = Math.max(res[0], l + r + root.data);
        return root.data + Math.max(l, r);
    }

    static int findMaxSum(Node root) {   
        int[] res = {root.data};
        maxPathSumUtil(root, res);
        return res[0];
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        System.out.println(findMaxSum(root)); 
    }
}
