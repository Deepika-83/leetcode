class Solution {
    public int maxProduct(int[] nums) {
      int n=nums.length;
      int p1=1,p2=1,maxi=Integer.MIN_VALUE;  
      for(int i=0;i<n;i++){
        if(p1==0) p1=1;
        if(p2==0) p2=1;
        p1*=nums[i];
        p2*=nums[n-i-1];
        maxi=Math.max(maxi,Math.max(p1,p2));
      }
      return maxi;
    }
}