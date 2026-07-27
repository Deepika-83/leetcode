class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,sl=-1,l=nums[0];
        for(int i=1;i<n;i++){ 
            if(nums[i]>=l){
                sl=l;l=nums[i];
            }
            else if(nums[i]<l && nums[i]>sl){
                sl=nums[i];
            }
        }
        int p=(sl-1)*(l-1);
        return p;
    }
}