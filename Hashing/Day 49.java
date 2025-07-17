class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        int res=0;
        int currsum=0;
        
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            
            if(currsum==k){
              res++;
            }
            
            if(map.containsKey(currsum-k)){
                res+=map.get(currsum-k);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return res;
    }
}