class Solution {
    public int minimumChairs(String s) {
        int c=0,mc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='E'){
                c++;
                mc=Math.max(mc,c);
            }
            else{
                c--;
            }
        }
        return mc;
    }
}