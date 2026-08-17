class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,l=0,r=0,mc=0;
        while(r<nums.length){
            if(nums[r]!=1){
                mc=Math.max(mc,c);
                c=0;
                r++;
            }
            else{
                c++;
                mc=Math.max(mc,c);
                r++;
            }
        }
        return mc;
    }
}