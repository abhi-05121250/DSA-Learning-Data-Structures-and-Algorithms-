class Solution {
    public String longestCommonPrefix(String[] str) {
        
        String result=str[0];
        for(int i=0;i<str.length;i++){
            int min=Math.min(result.length(), str[i].length());
            int j;
            
            for(j=0;j<min;j++){
                char ch1=str[i].charAt(j);
                char ch2=result.charAt(j);
                
                if(ch1!=ch2){
                    break;
                }
            }
            
            result=str[i].substring(0,j);
            
        }
        
        return result;
        
    }
}