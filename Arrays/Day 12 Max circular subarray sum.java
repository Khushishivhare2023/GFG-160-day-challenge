class Solution {
    public int circularSubarraySum(int arr[]) {
        // Code here
        int n=arr.length;
        int totalsum=0;
        int currmaxsum=0;
        int currminsum=0;
        int maxsum=arr[0];
        int minsum=arr[0];
        
        for(int i=0;i<n;i++){
            //find maxsum
            currmaxsum=Math.max(currmaxsum+arr[i],arr[i]);
            maxsum=Math.max(currmaxsum,maxsum);
            //find minsum
            currminsum=Math.min(currminsum+arr[i],arr[i]);
            minsum=Math.min(currminsum,minsum);
            //total sum 
            totalsum+=arr[i];
        }
        int normalsum=maxsum;
        int circularsum=totalsum-minsum;
        
        if(minsum==totalsum){
            return normalsum;
        }
        return Math.max(circularsum,normalsum);
        
    }
}
