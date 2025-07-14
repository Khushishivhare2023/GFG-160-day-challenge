import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> st= new HashSet<>();
        for(int num:a ){
            st.add(num);
        }
        for(int num:b){
            st.add(num);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:st){
            arr.add(num);
        }
        return arr;
    }
}