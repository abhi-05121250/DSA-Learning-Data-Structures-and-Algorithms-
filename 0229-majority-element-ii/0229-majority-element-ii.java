class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ls=new ArrayList<Integer>();
        int n=nums.length;
        
        HashMap<Integer, Integer> mp=new HashMap<>();
        
        int mini = (int)(n / 3) + 1;
        
        for(int i=0;i<nums.length;i++){
            int value = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], value + 1);
            //checking if v[i] is
            // the majority element:
            if (mp.get(nums[i]) == mini) {
                ls.add(nums[i]);
            }
            if (ls.size() == 2) break;
        }
      
            
            return ls;
        
    }
               
}