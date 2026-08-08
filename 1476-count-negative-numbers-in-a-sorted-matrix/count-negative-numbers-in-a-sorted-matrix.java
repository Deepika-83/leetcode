class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}