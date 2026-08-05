class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs=new HashMap<>();
        for(String st:strs){
            char[] arr=st.toCharArray(); 
            Arrays.sort(arr);
            String key=new String(arr);
            if(!hs.containsKey(key)){
                hs.put(key,new ArrayList<>());
            }
            hs.get(key).add(st);

        }
        return new ArrayList<>(hs.values());
    }
}