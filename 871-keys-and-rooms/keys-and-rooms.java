class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] b=new boolean[n];
        dfs(rooms,0,b);
        for(int i=0;i<n;i++){
            if(!b[i]){
                return false;
            }
        }
        return true;
        
    }
    public void dfs(List<List<Integer>> rooms,int node,boolean[] b){
        b[node]=true;
        for(int nei:rooms.get(node)){
            if(!b[nei]){
                dfs(rooms,nei,b);
            }
        }
    }
}