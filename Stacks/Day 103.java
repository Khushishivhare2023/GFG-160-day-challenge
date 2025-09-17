class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        int maxArea=0;
        int[]nsr=new int[n];
        int[]nsl=new int[n];
        Stack<Integer>s=new Stack<>();
        //nsr
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //nsl
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int hi=arr[i];
            int wid=nsr[i]-nsl[i]-1;
            int currArea=hi*wid;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
}
