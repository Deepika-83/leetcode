class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    c++;
                }
            }
            arr[i]=c;
         }
         return arr;
    }
}