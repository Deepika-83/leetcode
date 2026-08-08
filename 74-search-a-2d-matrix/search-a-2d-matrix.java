class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,r=m*n-1;
        while(l<=r){
            int mi=l+(r-l)/2;
            int row=mi/m;
            int col=mi%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                r=mi-1;
            }
            else{
                l=mi+1;
            }
        }
        return false;
    }
}