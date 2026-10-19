class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        for(int num=0;num<nums.length;num++){
            if(nums[num]==target){
                li.add(num);

            }
        }
        return li;
    }
}