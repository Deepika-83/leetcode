class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int l=0,r=l+1;
        while(r<n && l<n-1){
            if(nums[l]==nums[r]){
                nums[l]*=2;
                nums[r]=0;
                l=l+2;
                r=r+2;
            }
            else{
                l++;
                r++;
            }
        }
        int lo=0,h;
        for(h=0;h<n;h++){
            if(nums[h]!=0){
                int t=nums[lo];
                nums[lo]=nums[h];
                nums[h]=t;
                lo++;
                

            }
        }

        return nums;
    }
}