class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        int target=graph.length-1;
        dfs(0,ans,path,graph,target);
        return ans;
    }
    public void dfs(int node,List<List<Integer>> ans,List<Integer> path,int[][] graph,int target){
        if(node==target){
            ans.add(new ArrayList<>(path));
            return;

        }
        for(int nei:graph[node]){
            path.add(nei);
            dfs(nei,ans,path,graph,target);
            path.remove(path.size()-1);
        }
    }
}