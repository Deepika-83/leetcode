class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=nums.length;
        int c=0;
        for(int num:nums){
            c+=hs.getOrDefault(num,0);
            hs.put(num,hs.getOrDefault(num,0)+1);
            
        }
        // int s=0;
        // for(int nu:hs.keySet()){
        //                    int ci=hs.get(nu);

        //     if(ci>1){

        //        s=s+ci*(ci-1)/2;
        //     }
        // }
        return c;
    }
}