class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int j=nums[i];
            int s=0,r=0;
            while(j>0){
                r=j%10;
                s=s+r;
                j=j/10;

            }
            nums[i]=s;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}