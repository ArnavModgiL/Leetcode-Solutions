class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int inc = 1;
        int desc = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                inc++;
                desc = 1;
            }

            if(nums[i] < nums[i - 1]){
                desc++;
                inc = 1;
            }

            if(nums[i] == nums[i - 1]){
                inc = 1;
                desc = 1;
            }

            ans = Math.max(ans, Math.max(inc, desc));
        }
        return ans;
    }
}