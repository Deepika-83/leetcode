class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int mx=0;
        int value=0,c=0;
        for(int i=0;i<n;i++){
             c=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
                
            if(c>mx){
                    mx=c;
                    value=i;

                }
        
        }
        int[] arr=new int[2];
        arr[0]=value;
        arr[1]=mx;
        return arr;
    }
}