class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=val){
                c++;
                int t=nums[l];
                nums[l]=nums[r];
                l++;
            }
        }
        return c;
    }
}