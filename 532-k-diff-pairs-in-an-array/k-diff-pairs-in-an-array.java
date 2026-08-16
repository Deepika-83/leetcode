class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int r=n-1;
            while(r>i){
                int di=Math.abs(nums[i]-nums[r]);
                if(di==k){
                    c++;
                    while(i<r && nums[r]==nums[r-1]) r--;
                    r--;
                }
                else{ 
                r--;
                }
                
            }
        }
        return c;
    }
}