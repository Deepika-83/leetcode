class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        int c=n;
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                c=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return c;
    }
}