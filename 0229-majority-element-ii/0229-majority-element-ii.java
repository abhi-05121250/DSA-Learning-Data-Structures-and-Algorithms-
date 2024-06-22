class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ls=new ArrayList<Integer>();
        int n=nums.length;
        
        int cnt1=0,cnt2=0;
        int ele1=0, ele2=0;
        
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2=1;
                ele2=nums[i];
            }else if(nums[i]==ele1){
                cnt1++;
            }else if(nums[i]==ele2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1=0;
        cnt2=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==ele1)
                cnt1++;
            else if(nums[i]==ele2){
                cnt2++;
            }
        }
        
        if(cnt1>n/3)
            ls.add(ele1);
        if(cnt2>n/3)
            ls.add(ele2);
        
        return ls;
        
    }
               
}