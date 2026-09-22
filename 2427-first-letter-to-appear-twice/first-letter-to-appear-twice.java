class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                return i;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return 'd';
    }
}