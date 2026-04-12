class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int i,j,c=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i<j && nums[i]==nums[j]){
                    c++;
                }

            }
        }
        return c;
    }
}