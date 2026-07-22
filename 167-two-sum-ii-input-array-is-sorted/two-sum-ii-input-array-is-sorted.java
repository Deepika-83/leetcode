class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0,r=n-1;
        int s=0;
        while(l<=n){
            s=numbers[l]+numbers[r];
            if(s==target){
                // return new int[] {l+1,r+1};
                break;
            }
            else if(s>target){
                r--;
            }
            else if(s<target){
                l++;
            }

        }
        return new int[] {l+1,r+1};
        
    }
}