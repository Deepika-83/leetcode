class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p=1,gc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                gc++;
            }
            else{
                p=p*nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && gc==0){
                nums[i]=p/nums[i];
            }
            else if(nums[i]==0 && gc>1){
                nums[i]=0;
            }
            else if(nums[i]==0 && gc==1){

                nums[i]=p;
            }
            else{
                nums[i]=0;
            }
        }
        return nums;
    }
}