class Solution {
    static Node LCA(Node root, Node n1, Node n2) {
        while (root != null) {
            if (root.data > n1.data && root.data > n2.data)
                root = root.left;
            else if (root.data < n1.data && root.data < n2.data)
                root = root.right;
            else
                break;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Node n1 = root.left.left;
        Node n2 = root.left.right.right;
        Node res = LCA(root, n1, n2);
        System.out.println(res.data);
    }
}