class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            if(arr[lo]<arr[hi]){
                return arr[lo];
            }
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[hi]){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        return arr[lo];
    }
}

