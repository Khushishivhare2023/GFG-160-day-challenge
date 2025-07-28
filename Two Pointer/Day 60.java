class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int maxwater=0;
        int lp=0;
        int rp=arr.length-1;
        while(lp<rp){
            int ht=Math.min(arr[lp],arr[rp]);
            int wd=rp-lp;
            int currmax=ht*wd;
            maxwater=Math.max(maxwater,currmax);
            if(arr[lp]<arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
}
