class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int val=0;
        int mdis=Integer.MAX_VALUE;
        Arrays.sort(nums);
    for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int l=i+1,r=n-1;
        int sum=0;
        while(l<r){
             sum=nums[i]+nums[l]+nums[r];
             int di=Math.abs(target-sum);
             if(di<mdis){
                val=sum;
                mdis=di;
            }
            if(sum==target){
                return sum;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
                
            
            
        }

    }
    return val;
    }
}