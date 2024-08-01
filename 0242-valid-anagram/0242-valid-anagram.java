class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s==null || t==null){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }        
        
        HashMap<Character, Integer> mp=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int c=mp.get(ch);
                mp.put(ch, c+1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }else{
                int c=mp.get(ch);
                mp.put(ch,c-1);
            }
        }
        
        Set<Character> set=mp.keySet();
        for(char ch: set){
            if(mp.get(ch)!=0){
                return false;
            }
        }
        
        return true;
        
        
    }
}