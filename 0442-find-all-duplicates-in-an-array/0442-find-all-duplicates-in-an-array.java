class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // Set me sirf unique elements store hote hain
        HashSet<Integer> set = new HashSet<>();

        // Duplicate elements ko store karne ke liye result list
        List<Integer> ans = new ArrayList<>();

        // Array ke har element ko check karenge
        for (int x : nums) {

            // Agar x already Set me present hai,
            // iska matlab x duplicate hai
            if (set.contains(x)) {
                ans.add(x);
            }

            // Agar x pehli baar mila hai,
            // to use Set me add kar do
            else {
                set.add(x);
            }
        }

        // Saare duplicate elements return kar do
        return ans;
    }
}
