public class Solution {
    public int maxLength(String s) {
        int maxLen = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(-1); // Base index for valid substring calculation
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        
        return maxLen;
    }
}
