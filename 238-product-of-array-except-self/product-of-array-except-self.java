class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
arr[0]=1;
        int p=1,gc=0;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int resp=1;
        for(int r=n-1;r>=0;r--){
            arr[r]=arr[r]*resp;
            resp*=nums[r];
            
           
        }
        return arr;
    }
}