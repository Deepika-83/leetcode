class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char ch:s.toCharArray()){

        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(map.get(ch)==1){
        //         return i;
        //     }
        // }
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}