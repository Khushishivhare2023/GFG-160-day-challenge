import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        //convert to lowercase 
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //check the lengths are same 
        if(s1.length()==s2.length()){
            //convert to char array 
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray(); 
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            boolean result=Arrays.equals(ch1,ch2);
            if(result){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}