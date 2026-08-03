class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){ 
            int ts=target-nums[i];
            if(hs.containsKey(ts)){
                return new int[]{hs.get(ts),i};
            }
            hs.put(nums[i],i);

        }
        
        return new int[]{-1,-1};
    }
}