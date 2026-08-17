class Solution {
    public int maxPower(String s) {
        int c=1,mc=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( i>0 &&ch==s.charAt(i-1))
            {
                c++;
                mc=Math.max(mc,c);
            }
            else{
                c=1;
            }
        }
        return mc;
    }
}