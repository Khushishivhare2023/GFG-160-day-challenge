import java.util.*;
class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> st= new HashSet<>();
        int res=0;
        
        for(int num:arr){
            st.add(num);
        }
        
        for(int num:arr){
            if(st.contains(num) && !st.contains(num-1)){
                int curr=num;
                int cnt=0;
                while(st.contains(curr)){
                    st.remove(curr);
                    curr++;
                    cnt++;
                }
                res=Math.max(cnt,res);
            }
        }
        return res;
    }
}