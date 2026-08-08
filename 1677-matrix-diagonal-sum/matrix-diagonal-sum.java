class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int s=0;
        if(n==1){
            return mat[0][0];
        }
        for(int i=0;i<n;i++){
            s+=mat[i][i];
        }
        for(int i=0;i<n;i++){
            s+=mat[i][n-1-i];
        }
        if(n>2 && n%2==1){ 
        s=s-mat[n/2][n/2];
        }
        return s;
    }
}