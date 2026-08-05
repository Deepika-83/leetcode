class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
            
        }
        int c=0,s=0;
        for(int nu:hs.keySet()){
            if(hs.get(nu)>1){

               int ci=hs.get(nu);
               s=s+ci*(ci-1)/2;
            }
        }
        return s;
    }
}