class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res.add(-1);
            }else{
                res.add(s.peek());
            }
            s.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
        
    }
}