class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        arr[0]=0;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+nums[i-1];
        }
        int rsum=0;
        for(int r=n-1;r>=0;r--){
            arr[r]=Math.abs(arr[r]-rsum);
            rsum+=nums[r];
        }
        return arr;
    }
}