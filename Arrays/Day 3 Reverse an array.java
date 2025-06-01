class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}