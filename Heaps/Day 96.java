import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]);
    
        for (int[] p : points) {
            int dist = p[0]*p[0] + p[1]*p[1];
            pq.offer(new int[]{dist, p[0], p[1]});
            if (pq.size() > k) pq.poll();
        }
        
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] temp = pq.poll();
            res[i][0] = temp[1];
            res[i][1] = temp[2];
        }
        return res;
    }
}
