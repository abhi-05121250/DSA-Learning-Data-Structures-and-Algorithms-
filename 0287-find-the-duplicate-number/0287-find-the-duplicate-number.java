class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] prefix=new int[nums.length+1];
        int rep=-1;
        Arrays.fill(prefix,0);
       for (int i = 0; i < nums.length; i++) {
            if (prefix[nums[i]] == 0) {
                prefix[nums[i]] += 1;
            } else {
                return nums[i];
            }
        }
        
        return 0;
        
    }
}