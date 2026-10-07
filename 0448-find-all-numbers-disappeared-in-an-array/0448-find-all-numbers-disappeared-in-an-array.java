class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int x : nums){
            map.put(x, true);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}