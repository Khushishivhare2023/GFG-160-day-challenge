class Solution {
    static final int max_char=26;
    static char nonRepeatingChar(String s) {
        // code here
        int[] vis=new int[max_char];
        Arrays.fill(vis,-1);
        
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(vis[index]==-1){
                vis[index]=i;
            }
            else{
                vis[index]=-2;
            }
        }
        int idx=-1;
        for(int i=0;i<max_char;i++){
            if(vis[i]>=0 && (idx==-1 || vis[idx]>vis[i])){
                idx=i;
            }
        }
        return (idx==-1)? '$':s.charAt(vis[idx]);
    }
}
