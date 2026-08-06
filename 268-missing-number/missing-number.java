class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int XOR=n;
        for(int i=0; i<n; i++){
            XOR=XOR^i;
            XOR=XOR^nums[i];
        }
         return XOR;
    }
   
}