class Solution {
    public int reverseBits(int n) {
        int rev=0;
        int lastdigit=0;
        for(int i=0; i<32; i++)
        {
            rev<<=1;
            lastdigit=n&1;
            rev|=lastdigit;
            n>>>=1;
        }
        return rev;
    }
}