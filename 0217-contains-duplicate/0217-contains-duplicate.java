class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> mp=new HashMap<>();
        
        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e: mp.entrySet()) 
            if(e.getValue()>=2){
                return true;
            }
        
        return false;
        }
        
        
    }
