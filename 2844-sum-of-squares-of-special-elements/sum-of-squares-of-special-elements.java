class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                s=s+nums[i]*nums[i];
            }
        }
        return s;
    }
}