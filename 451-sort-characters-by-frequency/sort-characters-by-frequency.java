class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        // HashMap<Integer,List<character>> mp=new HashMap<>()
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b) ->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> entry:list){
            char ch=entry.getKey();
            int count=entry.getValue();
            for(int i=0;i<count;i++){
                // System.out.print(ch);
                res.append(ch); 
            }
        }
return res.toString();
    }
}