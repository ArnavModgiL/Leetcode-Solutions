class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){ // start from 1 bez i[0] sai phle element nhi hai.
            // current element + previous ka running sum -> current position ki value. . .
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums; // nums ki value return krdo.
    }
}