class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        int c=0,value=-1,mx=0;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(i!=j && grid[i][j]==1){
                    c++;
                }
            }
            if(c>mx){
                mx=c;
                value=i;
            }
        }
            return value;

    }
}