class Solution {
    public int digitProduct(int n){
        int p=1;
        while(n>0){
            int r=n%10;
            p=p*r;
            n=n/10;
        }
        return p;
    }

    public int smallestNumber(int n, int t) {

while(true){ 
            int product=digitProduct(n);
        if(product%t==0){
            return n;
        }
        n++;
        
    }    
    }
}