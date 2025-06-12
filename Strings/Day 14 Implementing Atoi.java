class Solution {
    public int myAtoi(String s) {
        // Your code here
        int sign=1;
        int res=0;
        int idx=0;
        //skip leading whitespaces 
        while(idx<s.length() && s.charAt(idx) == ' '){
            idx++;
        }
        //check for sign 
        if(idx<s.length() &&(s.charAt(idx) == '-' || s.charAt(idx) == '+')){
            if(s.charAt(idx++) == '-'){
                sign=-1;
            }
        }
        //Constructing number digit by digit
        while(idx<s.length() && s.charAt(idx)>='0' && s.charAt(idx)<='9'){
            //overflow and underflow test case 
            if(res>Integer.MAX_VALUE/10 || 
                     (res == Integer.MAX_VALUE/10 && s.charAt(idx)-'0'>7)){
                return sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            }
            //append
            res=10*res+(s.charAt(idx++)-'0');
        }
        return res*sign;
    }
}