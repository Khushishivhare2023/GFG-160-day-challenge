class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo=0;
        int hi=arr.length-1;
        int res=arr.length+k;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>mid+k){
                res=mid+k;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return res;
    }
}