class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        for(int x : map.keySet()){
            if(map.get(x) == 2){
                ans.add(x);
            }
        }
        return ans;
    }
}