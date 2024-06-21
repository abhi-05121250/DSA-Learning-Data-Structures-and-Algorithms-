class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] prefix=new int[nums.length+1];
        int rep=-1;
        Arrays.fill(prefix,0);
        for(int i=0;i<nums.length;i++){
            prefix[nums[i]]++;
        }
        
        for(int i=1;i<prefix.length;i++){
            if(prefix[i]>1){
                rep=i;
                break;
            }
        }
        
        return rep;
        
    }
}