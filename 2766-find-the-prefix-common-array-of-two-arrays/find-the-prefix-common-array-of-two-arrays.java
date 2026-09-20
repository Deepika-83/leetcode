class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=A.length;
        int[] arr=new int[n];
        arr[0]=0;
        for(int i=0;i<n;i++){
            int c=0;
            hm.put(A[i],hm.getOrDefault(A[i],0)+1); 
             hm.put(B[i],hm.getOrDefault(B[i],0)+1);
             for(int j:hm.keySet()){
                if(hm.get(j)==2){
                    c++;
                }
             }
             if(A[i]==B[i] || A[i]!=B[i]){ 
             arr[i]=c;
             }

           

        }
        return arr;
    }
}