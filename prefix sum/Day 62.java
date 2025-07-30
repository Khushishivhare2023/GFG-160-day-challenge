class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer>mp=new HashMap<>();
        int res=0;
        int prefsum=0;
        for(int i=0;i<arr.length;i++){
            prefsum+=arr[i];
            
            if(prefsum==k){
                res=i+1;
            }else if(mp.containsKey(prefsum-k)){
                res=Math.max(res,i-mp.get(prefsum-k));
            }
            if(!mp.containsKey(prefsum)){
                mp.put(prefsum,i);
            }
        }
        return res;
    }
}
