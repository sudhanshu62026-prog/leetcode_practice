class Solution {
    public int singleNumber(int[] nums) {
        int XOR=0;
        for(int n : nums){
            XOR=XOR^n;
        }
        return XOR;
    }
}