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
}*/

class Solution {
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                list.add(-1);
            } else {
                list.add(curr.data);
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return list;
    }
    public Node deSerialize(ArrayList<Integer> arr) {
        if (arr.size() == 0) return null;
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.size()) {
            Node curr = q.poll();
            if (arr.get(i) != -1) {
                curr.left = new Node(arr.get(i));
                q.add(curr.left);
            }
            i++;
            if (i >= arr.size()) break;
            if (arr.get(i) != -1) {
                curr.right = new Node(arr.get(i));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}
