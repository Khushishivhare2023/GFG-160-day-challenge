class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(boxed[i]);
        }
        return res;
    }
}
