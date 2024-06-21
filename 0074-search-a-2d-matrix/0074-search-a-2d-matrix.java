class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean value=false;
         for(int i=0;i<n;i++){
             if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                 value=binarySearch(matrix,i, target);
                 break;
             }
         }
       
        
        return value;
        
        
        
    }
    
    public boolean binarySearch(int[][] matrix,int i, int target){
        int low=0;
        int high=matrix[i].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[i][mid]==target){
                return true;
            }
            else if(matrix[i][mid]>target){
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        
        return false;
        
    }
    
    
}