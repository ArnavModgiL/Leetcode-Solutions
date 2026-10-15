class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0; // current array kha sum default zero liya...
        int maxSum = Integer.MIN_VALUE; // BEz hmne sbse choti value tkh check krna hai islye..

        for(int x = 0; x < nums.length; x++){
            // Current element se naya subarray start karna hai ya purane subarray mein current element add karke continue karna hai, dono mein se jo sum maximum hoga, use currSum mein store kar do......
            currSum = Math.max(nums[x], currSum + nums[x]); 
            // maxSum aur currSum mein se jo sum maximum hoga, use maxSum mein store kar do, taaki ab tak ka maximum subarray sum track hota rahe.
            maxSum = Math.max(maxSum , currSum);
        }
        return maxSum;
    }
}