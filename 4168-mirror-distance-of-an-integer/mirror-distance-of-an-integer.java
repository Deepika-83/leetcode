class Solution {
    public int mirrorDistance(int n) {
        int t=n;
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        int res=Math.abs(t-s);
        return res;
    }
}