class Solution {
    public List<Integer> findMissingElements(int[] nums) {
                Arrays.sort(nums);
        int n=nums.length;
HashSet<Integer> set=new HashSet<>();
for(int num:nums){
    set.add(num);
}
        ArrayList<Integer> li=new ArrayList<>();
        int i=nums[0];
         int j=nums[n-1];
            //int k=i;
int l=0;
while(i<j){
    if(!set.contains(i)){
        li.add(i);
    }
    i++;
}

return li;   
    }
}