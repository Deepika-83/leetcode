class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
           int d=n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n=n/10;

        }
        int s=0;
        for(int num:map.keySet()){ 
            s+=num*map.get(num);

        }
        return s;
    }
}