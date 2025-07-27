import java.util.*;
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        
        int res=0;
        for(int i=1;i<n-1;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            res+=waterlevel-arr[i];
        }
        return res;
    }
}
