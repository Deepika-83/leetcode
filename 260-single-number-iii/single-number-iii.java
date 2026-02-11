class Solution {
    public int[] singleNumber(int[] nums) {
        //Deepika
        int n=nums.length;
        Arrays.sort(nums);
        int[] arr=new int[2];
        int k=0,i=0;
        while(i<n){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==2){
                i=i+2;
            }
            else if(k<2 && c<2){
                arr[k++]=nums[i];
                i++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}