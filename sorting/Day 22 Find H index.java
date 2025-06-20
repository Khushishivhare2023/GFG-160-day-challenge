class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] freq=new int[n+1];
        
        for(int i:citations){
            if(i>n){
                freq[n]++;
            }
            else{
                freq[i]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count=count+freq[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}