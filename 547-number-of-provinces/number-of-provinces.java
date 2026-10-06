class Solution {
    public void  dfs(List<List<Integer>> graph,int node,boolean[] b){
                b[node]=true;
                for(int nei:graph.get(node)){
                    if(!b[nei]){
                        dfs(graph,nei,b);
                    }
                }
            }
    public int findCircleNum(int[][] isConnected) {

        List<List<Integer>> graph=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>()); 

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1)
                graph.get(i).add(j);
                    

            }
        }
            boolean[] b=new boolean[n];
            // dfs(graph,0,b);
            int c=0;
            for(int i=0;i<n;i++){
                if(!b[i]){
                    c++;
                    dfs(graph,i,b);
                }

            }
        
                    return c;

        
    }
  

}