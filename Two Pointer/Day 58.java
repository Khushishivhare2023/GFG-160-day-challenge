class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n=s.length();
        int res=0;
        int[] lastidx= new int[26];
        for(int i=0;i<26;i++){
            lastidx[i]=-1;
        }
        int start=0;
        for (int end=0;end<n;end++){
            start=Math.max(start,lastidx[s.charAt(end)-'a']+1);
            res=Math.max(res,end-start+1);
            lastidx[s.charAt(end)-'a']=end;
        }
        return res;
    }
}