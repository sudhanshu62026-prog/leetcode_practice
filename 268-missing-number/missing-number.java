class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,arrsum=0;

        for(int i=0; i<=nums.length; i++){
            sum+=i;
        }
        for(int i=0; i<nums.length; i++){
             arrsum+=nums[i];
        }
        return sum-arrsum;
        
    }
}