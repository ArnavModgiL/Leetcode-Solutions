class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);  // Prefix sum 0 initially 1 baar aaya hai

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i]; // Current prefix sum

            if(map.containsKey(sum - k)) { // Agar required prefix sum pehle aaya hai
                count = count + map.get(sum - k);
            }

            if(map.containsKey(sum)){  // Current prefix sum ko map mein store/update karo
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum , 1);
            }
        }
        return count;
    }
}