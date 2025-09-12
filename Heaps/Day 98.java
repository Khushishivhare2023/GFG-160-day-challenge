import java.util.*;
class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> ans = new ArrayList<>();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int num : arr) {
            left.add(num);
            right.add(left.poll());
            if (right.size() > left.size()) {
                left.add(right.poll());
            }
            if (left.size() > right.size()) {
                ans.add((double) left.peek());
            } else {
                ans.add(((double) left.peek() + (double) right.peek()) / 2.0);
            }
        }

        return ans;
    }
}
