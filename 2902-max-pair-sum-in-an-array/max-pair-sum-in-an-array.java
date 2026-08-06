class Solution {
    public int digitMax(int m){
        int s=0;
        while(m>0){
            int r=m%10;
            m=m/10;
            s=Math.max(s,r);
        }
        return s;

    }
    public int maxSum(int[] nums) {
        int n=nums.length;
        int msum=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int sum=0;
            int val=digitMax(nums[i]);
            if(map.containsKey(val)){
             sum=map.get(val)+nums[i];
            msum=Math.max(sum,msum);
            map.put(val,Math.max(map.get(val),nums[i]));
            }
            else{ 
                           map.put(val,nums[i]);
            }

        }
        
        return msum;
    }
}