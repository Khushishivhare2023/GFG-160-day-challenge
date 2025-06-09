class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxprod=Integer.MIN_VALUE;
        
        int lTr=1;
        int rTl=1;
        for(int i=0;i<n;i++){
            if(lTr==0)
                lTr=1;
            if(rTl==0)
                rTl=1;
            
            lTr*=arr[i];
            int j=n-i-1;
            rTl*=arr[j];
            maxprod=Math.max(lTr,Math.max(rTl,maxprod));
        }
        return maxprod;
    }
}