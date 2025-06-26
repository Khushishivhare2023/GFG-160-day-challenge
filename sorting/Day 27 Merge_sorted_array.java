import java.util.*;
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        int k=a.length-1;
        while(i<=k && j<m){
            if(a[i]<b[j]){
                i++;
                continue;
            }
            else{
                int temp=a[k];
                a[k]=b[j];
                b[j]=temp;
                k--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
