class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        int presum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            presum+=(arr[i]==0)?-1:1;
            if(presum==0){
                res=i+1;
            }
            if(mp.containsKey(presum)){
                res=Math.max(res,i-mp.get(presum));
            }else{
                mp.put(presum,i);
            }
        }
        return res;
    }
}