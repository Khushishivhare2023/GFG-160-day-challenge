class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n=arr.length;
        int maxend=arr[0];
        int res=arr[0];
        
        for(int i=1;i<n;i++){
            maxend=Math.max(maxend+arr[i],arr[i]);
            res=Math.max(maxend,res);
        }
        return res;
    }
}

