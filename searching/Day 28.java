class Solution {
    static int lowerbound(int[] arr,int target){
        int lo=0;
        int hi=arr.length-1;
        int first=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                first=mid;
                hi=mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return first;
    }
    static int upperbound(int[] arr, int target){
        int lo=0;
        int hi=arr.length-1;
        int last=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                last=mid;
                lo=mid+1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return last;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int firstocc=lowerbound(arr,target);
        if(firstocc==-1) return 0;
        int lastocc=upperbound(arr,target);
        return lastocc-firstocc+1;
        
        
    }
}
