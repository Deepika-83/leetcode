class Solution {
    public List<String> commonChars(String[] words) {
        int[] curr=new int[26];
        for(char ch:words[0].toCharArray()){
            curr[ch-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] next=new int[26];
            for(char ch:words[i].toCharArray()){
            next[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                curr[j]=Math.min(curr[j],next[j]);
            }
        }
            
        
        List<String> li=new ArrayList<>();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i); 
            for(int j=0;j<curr[i];j++){ 
                li.add(String.valueOf(ch)); 
            }
        }
        return li;
    }
}
