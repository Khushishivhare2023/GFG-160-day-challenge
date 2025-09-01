/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        ArrayList<Integer> values = new ArrayList<>();
        inorder(root, values);
        int left = 0, right = values.size() - 1;
        while (left < right) {
            int sum = values.get(left) + values.get(right);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    private void inorder(Node root, ArrayList<Integer> values) {
        if (root == null) return;
        inorder(root.left, values);
        values.add(root.data);
        inorder(root.right, values);
    }
}
