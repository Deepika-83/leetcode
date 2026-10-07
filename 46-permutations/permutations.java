class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visit=new boolean[nums.length];
        dfs(nums,visit,path,li);
        return li;
    }
    public void dfs(int[] nums,boolean[] visit,List<Integer> path,List<List<Integer>> li){
        if(path.size()==nums.length){
            li.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i]){
                continue;
            }
            path.add(nums[i]);
            visit[i]=true;
            dfs(nums,visit,path,li);
            visit[i]=false;
            path.remove(path.size()-1);
            
        }
    

    }
        
}