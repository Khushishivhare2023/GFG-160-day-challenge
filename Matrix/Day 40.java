class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int lo =0;
        int hi=n*m-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int row=mid/m;
            int col=mid%m;
            
            if(mat[row][col]==x){
                return true;
            }
            if(mat[row][col]>x){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
}