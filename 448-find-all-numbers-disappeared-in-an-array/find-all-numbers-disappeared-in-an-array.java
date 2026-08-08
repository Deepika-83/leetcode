class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int mis=0;
        int n=nums.length;
        int[] fre=new int[n+1];
        for(int i=0;i<n;i++){
            fre[nums[i]]+=1;
        }
        int miss=0;
        int i;
        List<Integer> res=new ArrayList<>();
        for(i=1;i<=n;i++){
            if(fre[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}