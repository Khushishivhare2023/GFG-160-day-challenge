class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefixsum=0;
        int totalsum=0;
        
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        for(int pivot=0;pivot<arr.length;pivot++){
            int suffixsum=totalsum-prefixsum-arr[pivot];
            if(prefixsum==suffixsum){
                return pivot;
            }
            prefixsum+=arr[pivot];
        }
        return -1;
    }
}
