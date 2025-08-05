class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int[] prefProd=new int[n];
        int[] suffProd=new int[n];
        int[] res=new int[n];
        
        prefProd[0]=1;
        for(int i=1;i<n;i++){
            prefProd[i]=arr[i-1]*prefProd[i-1];
        }
        
        suffProd[n-1]=1;
        for(int j=n-2;j>=0;j--){
            suffProd[j]=arr[j+1]*suffProd[j+1];
        }
        
        for(int i=0;i<n;i++){
            res[i]=prefProd[i]*suffProd[i];
        }
        return res;
        
    }
}