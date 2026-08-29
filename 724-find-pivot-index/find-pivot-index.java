class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tp=0;
        for(int num:nums){
            tp=tp+num;
        }
        int l=0;
        for(int i=0;i<n;i++){
            int r=tp-nums[i]-l;
            if(r==l){
                return i;
            }
            l+=nums[i];
                
            
        }
return -1;
    }
}