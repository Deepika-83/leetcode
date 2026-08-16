class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int c=0;
        for(int num:nums){
            if(map.containsKey(num+k)){
                c=c+map.get(num+k);
            }
        }
        return c;
    }
}