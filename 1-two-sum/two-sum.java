class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=0;
        int y=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                   x=i;
                   y=j; 
                }
            }
        }
        return new int[]{x,y};
    }
}