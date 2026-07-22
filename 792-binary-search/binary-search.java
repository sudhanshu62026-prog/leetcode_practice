class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int x=-1;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                x=i;
            }
        }
        return x;
        
    }
}