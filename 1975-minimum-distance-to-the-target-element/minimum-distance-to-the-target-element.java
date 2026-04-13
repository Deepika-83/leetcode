class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                c=Math.abs(i-start);
                mini=Math.min(c,mini);
                
            }
        }
        return mini;
    }
}