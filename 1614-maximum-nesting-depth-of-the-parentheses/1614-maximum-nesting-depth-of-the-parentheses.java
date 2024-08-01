class Solution {
    public int maxDepth(String s) {
        
        int maxD=0, tempD=0;
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                stack.push(ch);
                tempD++;
            }else if(ch==')'){
                stack.pop();
                maxD=Math.max(maxD,tempD);
                tempD--;
            }
        }
        
        return maxD;
        
    }
}