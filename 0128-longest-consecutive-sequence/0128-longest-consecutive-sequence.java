class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
        
        // Agar num - 1 set mein nahi hai toh num ek consecutive sequence ka starting number hai
            if(!set.contains(num - 1)){
                int count = 1;

                // Check karte rahenge ki next consecutive number (num + count) set mein present hai ya nahi
                while(set.contains(num + count)){
                    count++;
                }
                
                // Ab tak ki longest length aur current length mein jo maximum hai, use longest mein store kar do
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}