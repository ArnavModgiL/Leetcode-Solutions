class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right])
            {  // matlab minimum mid ke right side mein hai aur mid khud minimum nahi ho sakta, isliye left = mid + 1 karke mid ko hata dete hain......
                left = mid + 1;
            }
            if(nums[mid] < nums[right]) 
            { // minimum left se mid ke beech (including mid) hai, isliye right = mid karte hain.
                right = mid;
            }
        }
        return nums[left];
        // isliye kiya kyunki loop ke end mein left == right ho jata hai, matlab left exactly minimum element ke index par hai.....
    }
}