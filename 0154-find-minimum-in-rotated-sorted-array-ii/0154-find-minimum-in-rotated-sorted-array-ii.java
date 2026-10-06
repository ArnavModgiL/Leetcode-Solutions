class Solution {

    public int findMin(int[] nums) {

        // Assume the first element is the minimum initially
        int mini = nums[0];

        // Traverse through the entire array
        for(int i = 0; i < nums.length; i++){

            // If the current element is smaller than our current minimum,
            // update the minimum value
            if(nums[i] < mini){
                mini = nums[i];
            }
        }
        
        // Return the smallest element found in the array
        return mini;
    }
}