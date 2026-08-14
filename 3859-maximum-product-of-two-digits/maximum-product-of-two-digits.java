class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        if(n%10==n){
            return n;
        }
        while(n>0){
            int x = n%10;
            n/=10;
            if(max1<x){
                max2=max1;
                max1=x;
            }
            else{
                if((x>max2))
                max2=x;
            }
        
        }
        return max1*max2;
    }
}