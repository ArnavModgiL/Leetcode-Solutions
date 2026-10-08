class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[ans];
                nums[ans] = nums[i];
                nums[i] = temp;
                
                ans++;
            }
        }  
        return nums;
    }
}