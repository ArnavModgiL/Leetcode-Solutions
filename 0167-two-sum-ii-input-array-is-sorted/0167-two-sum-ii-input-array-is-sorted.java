class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                return new int[]{left+1, right+1};
                // left aur right ke indices ko 1-based indexing mein convert karke array ke form mein answer return karta hai....
            }
            if(sum > target)
            {
                right--; // right pointer ko left ki or move krooo...
            }
            if(sum < target)
            {
                left++; // left pointer ko right ki or move krooo...
            }
        }
        return new int[]{}; // Ek empty integer array return karo, yani agar koi valid pair nahi mila toh [] return hoga.
    }
}