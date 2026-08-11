class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
                }
            for(int num:nums2){ 
            int v=k*num;
            for(int n:map.keySet()){
                if(n%v==0){
                    c+=map.get(n);
                }
            }
            }
        return c;
    }
}