class Solution {
    public boolean containsDuplicate(int[] nums) {
        int x = nums.length;
        if(x < 2){ // agr 2 sai km hai to return false.
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < x; i++){
            if(!set.add(nums[i])){ // agar element set mein already present tha. . .
                return true; // toh duplicate mil gaya true return kroo.
            }
        }
        return false;
    }
}