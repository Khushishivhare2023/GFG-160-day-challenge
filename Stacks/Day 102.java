class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer>span=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        s.push(0);
        span.add(1);
        
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span.add(i+1);
            }else{
                int prevhigh=s.peek();
                span.add(i-prevhigh);
            }
            s.push(i);
        }
        return span;
        
    }
}