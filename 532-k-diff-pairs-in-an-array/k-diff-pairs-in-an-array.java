class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(k==0){ 
        for(int n:map.keySet()){
            if(map.get(n)>=2){
                c++;
            }
        }
        }
        else{ 
        for(int n:nums){
            if(map.containsKey(n+k)){
                c++;
                map.remove(n+k);
            }
        }
        }
        return c;
    }
}