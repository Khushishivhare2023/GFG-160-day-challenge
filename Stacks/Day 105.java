import java.util.Stack;

class SpecialStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public SpecialStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    public void pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    public int peek() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}
