class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        for(int num:set1){
            if(set2.contains(num)){
                set3.add(num);
            }
        }
        int[] arr=new int[set3.size()];
        int i=0;
        for(int num:set3){
            arr[i++]=num;
        }
        return arr;

        
    }
}