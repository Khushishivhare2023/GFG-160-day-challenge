/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    public static Node mirror(Node root) {
        // code here
        if(root==null){
            return null;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);
        root.left=rightS;
        root.right=leftS;
        return root;
    }
}