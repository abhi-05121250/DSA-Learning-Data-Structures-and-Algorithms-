class Solution {
    public String longestCommonPrefix(String[] str) {
        return divideAndFindPrefix(str, 0, str.length-1);
        
    }
    
    private String divideAndFindPrefix(String[] strs, int left, int right){
        
        if(left==right){
            return strs[left];
        }
        else{
             int mid = (left + right) / 2;
           String lcpLeft = divideAndFindPrefix(strs, left, mid);
            String lcpRight = divideAndFindPrefix(strs, mid + 1, right);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }
    
    private String commonPrefix(String left, String right) {
    int minLength = Math.min(left.length(), right.length());
    for (int i = 0; i < minLength; i++) {
        if (left.charAt(i) != right.charAt(i)) {
            return left.substring(0, i);
        }
    }
    return left.substring(0, minLength);
}
}