class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int res=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else if(sum==target){
                    int ele1=arr[left];
                    int ele2=arr[right];
                    int cnt1=0;
                    int cnt2=0;
                    
                    while(left<=right && arr[left]==ele1){
                        left++;
                        cnt1++;
                    }
                    while(left<=right && arr[right]==ele2){
                        right--;
                        cnt2++;
                    }
                    if(ele1==ele2){
                        res+=(cnt1*(cnt1-1))/2;
                    }else{
                        res+=(cnt1*cnt2);
                    }
                }
            }
        }
        return res;
    }
}