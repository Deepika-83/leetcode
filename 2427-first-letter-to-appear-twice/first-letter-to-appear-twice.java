class Solution {
    public char repeatedCharacter(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char i:s.toCharArray()){
        //     if(map.containsKey(i)){
        //         return i;
        //     }
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // return 'd';
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            if(arr[ch-'a']>=1){
                return ch; 
            }
            arr[ch-'a']++;
        }
        return ' ';
    }
}