class Solution {
    public int singleNumber(int[] nums) {
        //Deepika
        int n=nums.length;
        int v=0;
        Arrays.sort(nums);
        int i=0;
        while(i<n){ 
            int c=0;
            for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        c++;
                    }
                
            }
            if(c==3){
                i=i+3;
            }
            else if(c<3){
                v=nums[i];
             break;
            }
            else{
                i++;
            }
        }         
        return v;
    }
}