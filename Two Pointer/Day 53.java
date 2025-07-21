import java.util.*;
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer>res=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        int left=0;
        int right=n-1;
        while(left<right){
            int currsum=arr[left]+arr[right];
            if(Math.abs(target-currsum)<mindiff){
                mindiff=Math.abs(target-currsum);
                res=Arrays.asList(arr[left],arr[right]);
            }
            if(currsum<target){
                left++;
            }
            else if(currsum>target){
                right--;
            }else{
                return res;
            }
        }
        return res;
    }
}