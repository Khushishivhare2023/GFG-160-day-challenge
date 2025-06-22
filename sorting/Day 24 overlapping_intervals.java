class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[] current = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int[] next = arr[i];
            if(next[0]<=current[1])
            {
                current[1] = Math.max(next[1],current[1]);
            }
            else
            {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);
        return merged;
    }
}
