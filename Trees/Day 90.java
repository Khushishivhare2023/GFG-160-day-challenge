class Solution {
    public int kthSmallest(Node root, int k) {
        int[] count = {0};
        int[] ans = {-1};    
        
        inorder(root, k, count, ans);
        return ans[0];
    }
    private void inorder(Node root, int k, int[] count, int[] ans) {
        if (root == null || ans[0] != -1) return;
        inorder(root.left, k, count, ans);
        count[0]++;
        if (count[0] == k) {
            ans[0] = root.data;
            return;
        }
        inorder(root.right, k, count, ans);
    }
}