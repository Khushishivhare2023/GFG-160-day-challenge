class Solution {
    // Function to search a given number in row-column sorted matrix.
    static boolean search(int[]arr, int x){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(x==arr[mid]){
                return true;
            }
            if(x<arr[mid]){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(search(mat[i],x)){
                return true;
            }
        }
        return false;
    }
}