class Solution {
    static int mergesort(int arr[],int si,int ei){
        if(si>=ei) return 0;
        int mid=si+(ei-si)/2;
        int leftinvcount=mergesort(arr,si,mid);
        int rightinvcount=mergesort(arr,mid+1,ei);
        int invcount=merge(arr,si,mid,ei);
        return leftinvcount+rightinvcount+invcount;
    }
    
    static int merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int invcount=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
                invcount+=(mid-i+1);
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(int m=0;m<temp.length;m++){
            arr[si+m]=temp[m];
        }
        return invcount;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergesort(arr,0,arr.length-1);
    }
}
