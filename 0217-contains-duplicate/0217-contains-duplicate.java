class Solution {
    public boolean containsDuplicate(int[] nums) {
        int x = nums.length;
        if(x < 2){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < x; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}