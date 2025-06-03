class Solution{
    static void nextPermutation(int[]arr){
        int n=arr.length;
        // find pivot 
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,n-1);
            return;
        }
        //find element in the right array that is greater than pivot  and swap
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        // Reverse the array from pivot+1 to end
        reverse(arr,pivot+1,n-1);
    }
        
        // helper function to reverse an array 
        private static void reverse(int[] arr,int start,int end){
            while(start<end){
                swap(arr,start++,end--);
            }
        }
        //helper function to swap an array
        private static void swap(int[]arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}
