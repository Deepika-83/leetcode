class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char st:t.toCharArray()){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(char str:s.toCharArray()){
            if(map.containsKey(str)){
                map.put(str,map.getOrDefault(str,0)-1);
            }
            if(map.get(str)==0){
                map.remove(str);
            }
        }
        return map.keySet().iterator().next();
    }
}