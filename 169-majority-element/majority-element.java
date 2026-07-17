class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
{ c=0;
    for(int j=0;j<n;j++){
        if(nums[i]==nums[j]){
            c++;
        }
    }
    if(c>(n/2)){
        return nums[i];
    }
}     return 0;   
    }
}