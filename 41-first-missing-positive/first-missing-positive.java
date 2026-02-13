class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=1;
        int i=0;
        int prev=0;
         while(i<n){ 
            if(nums[i]>0){
                if(nums[i]!=prev){
                    if(nums[i]==j){
                        j++;
                        prev=nums[i];
                        i++;
                    }
                    else{
                        return j;
                    }
                }
                else{
                     i++;
                }
            } 
            else{
                i++;
            }
    
     

      
    
         }
        return j;
        
    }
}