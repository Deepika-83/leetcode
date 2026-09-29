class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            li.get(u).add(v);
            li.get(v).add(u);
        }
        boolean[] visit=new boolean[n];
        
           return  dfs(source,destination,li,visit);
           
        
    }
    public boolean dfs(int node,int destination,List<List<Integer>> li,boolean[] visit){ 
        if(node==destination){
            return true;
        }
        visit[node]=true;
            for(int nei:li.get(node)){ 
                if(!visit[nei]){
                    if(dfs(nei,destination,li,visit)){
                        return true;
                    }
                }
            }
            return false;
    }
}