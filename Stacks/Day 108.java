class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }
}
