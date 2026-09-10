class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num , 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                ans.add(num);

                map.put(num, map.get(num) - 1);
            }
        }

        int[] list = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++){
            list[i] = ans.get(i);
        }
        return list;
    }
}