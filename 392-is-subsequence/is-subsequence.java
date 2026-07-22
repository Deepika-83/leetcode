class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
                int m=s.length();

        int i=0,j=0;
        int ma=Math.max(m,n);
        int c=0;
        while(i<n && j<m){
            if(s.charAt(j)==t.charAt(i)){
                c++;
                i++;
                j++;
            }
            else if(s.charAt(j)!=t.charAt(i)){
                i++;
            }
        }
         if(m==c){
            return true;
         }
         return false;
    }
}