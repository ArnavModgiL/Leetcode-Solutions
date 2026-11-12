class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1; // isliye initialize kiya kyunki ek single element khud mein valid increasing aur decreasing subarray hota hai. . .
        int inc = 1;
        int desc = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                inc++; // Increasing subarray ki length 1 se increase karta hai.
                desc = 1; // Decreasing sequence break ho gayi, isliye uski length reset karke 1 kar dete hain.
            }

            if(nums[i] < nums[i - 1]){
                desc++; // Decreasing subarray ki length 1 se increase karta hai.
                inc = 1; // Increasing sequence break ho gayi, isliye uski length reset karke 1 kar dete hain.
            }

            if(nums[i] == nums[i - 1]){
                inc = 1; // Equal elements hone ki wajah se strictly increasing sequence break ho jaati hai, isliye increasing length reset karke 1 kar dete hain.
                desc = 1;
            }

            ans = Math.max(ans, Math.max(inc, desc)); // ans se compare karke ab tak ki longest increasing or decreasing subarray ki maximum length update karta hai.
        }
        return ans;
    }
}