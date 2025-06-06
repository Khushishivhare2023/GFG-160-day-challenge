class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        int ele1=-1, ele2=-1;
        int cnt1=0, cnt2=0;
        
        for(int ele:nums){
            if(ele1==ele){
                cnt1++;
            }
            else if(ele2==ele){
                cnt2++;
            }
            else if(cnt1==0){
                ele1=ele;
                cnt1++;
            }
            else if(cnt2==0){
                ele2=ele;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        //Count the occurrences of candidates
        for(int ele :nums){
            if(ele1==ele) cnt1++;
            if(ele2==ele) cnt2++;
        }
        
        if(cnt1>n/3) res.add(ele1);
        if(cnt2>n/3 && ele2!=ele1) res.add(ele2);
        if(res.size()==2 && res.get(0)>res.get(1)){
            int temp=res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
    
}
