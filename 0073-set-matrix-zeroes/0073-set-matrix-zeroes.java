class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int[] rowArray=new int[m];
        int[] colArray=new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowArray[i]=1;
                    colArray[j]=1;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowArray[i]==1 || colArray[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}