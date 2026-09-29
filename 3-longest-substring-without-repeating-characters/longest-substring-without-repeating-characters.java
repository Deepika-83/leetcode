class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0,l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){ 
            char ch=s.charAt(r);
        
              if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);

              }
              map.put(ch,r);

             
             
             maxi=Math.max(maxi,r-l+1);
    }
            
            // }
            
            
            
        
        return maxi;
    }
}