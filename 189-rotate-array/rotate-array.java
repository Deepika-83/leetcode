class Solution {
     public void rotate(int[] nums, int k) {
        int n=nums.length;
                k=k%n;
                int start=0,end=n-k-1;
                int temp;
                while(start<end){
                    temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }
                start=n-k;
                end=n-1;
                while(start<end){
                    temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                    
                }
                start=0;
                end=n-1;
                while(start<end){
                    temp=nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }

//         int[] temp=new int[n-k];
//         int j=0;
//         for(int i=0;i<temp.length;i++){
//             temp[i]=nums[i];
//         }
//         int l=0;
//         for(int i=n-k;i<n;i++){
//             nums[l]=nums[i];
//             l++;
//         }
//         for(int i=k;i<n;i++){
//             nums[i]=temp[j];

//             j++;
//         }
        
    }
}