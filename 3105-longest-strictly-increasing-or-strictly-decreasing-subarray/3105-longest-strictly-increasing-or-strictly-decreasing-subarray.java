class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxL = 1;
        int inc = 1;
        int desc = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]){
                inc++;
                desc = 1;
            } else if(nums[i] < nums[i - 1]){
                desc++;
                inc = 1;
            } else {
                inc = 1;
                desc = 1;
            }
            maxL = Math.max(maxL, Math.max(inc,desc));
        }
        return maxL;
    }
}