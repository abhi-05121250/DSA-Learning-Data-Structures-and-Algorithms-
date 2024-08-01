class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()){
            return false;
        }
        
        if(s.equals(goal)){
            return true;
        }
        
        int n=s.length();
        String tempS=s;
        
        for(int i=1;i<n;i++){
            String t=""+tempS.charAt(0);
            for(int j=n-1;j>0;j--){
                t=tempS.charAt(j)+t;
            }
            
            if(t.equals(goal)){
                return true;
            }
            
            tempS=t;
        }
        
        return false;
        
    }
}