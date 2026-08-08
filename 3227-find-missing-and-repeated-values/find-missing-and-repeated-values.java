class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        int n=grid.length;
int rv=n,mv=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){ 
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
        }
        for(int i=1;i<=n*n;i++){
            if(!map.containsKey(i)){
                mv=i;
            }
            if( i!=mv && map.get(i)>1){  
                rv=i;
            }
        }
        li.add(rv);
        li.add(mv);
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}