class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){ 
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
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