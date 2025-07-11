import java.util.*;
class Solution {
    static boolean check (int[]arr,int k, int pagelimit){
        int cnt=1;
        int pageSum=0;
        for(int i=0;i<arr.length;i++){
            if(pageSum+arr[i]>pagelimit){
                cnt++;
                pageSum=arr[i];
            }
            else{
                pageSum+=arr[i];
            }
        }
        return (cnt<=k);
    }
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        int lo=Arrays.stream(arr).max().getAsInt();
        int hi=Arrays.stream(arr).sum();
        int res=-1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(check(arr,k,mid)){
                res=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
}