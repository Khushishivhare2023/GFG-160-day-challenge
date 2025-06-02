class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        //for d>n
        d%=n;
        //reverse the array before d
        reverse(arr,0,d-1);
        //reverse the array after d 
        reverse(arr,d,n-1);
        //reverse the whole array 
        reverse(arr,0,n-1);
        //function to reverse an array 
    }
    static void reverse(int[]arr,int start,int end){
        while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
        }
    }
}