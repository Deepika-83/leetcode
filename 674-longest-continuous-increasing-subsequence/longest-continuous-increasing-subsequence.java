class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=0,mc=1;
        for(int i=0;i<nums.length;i++){ 
            if(i>0 && nums[i]>nums[i-1]){
                c++;
                mc=Math.max(mc,c);
            }
            else{
                c=1;
            }
    }
        return mc;
    }
}