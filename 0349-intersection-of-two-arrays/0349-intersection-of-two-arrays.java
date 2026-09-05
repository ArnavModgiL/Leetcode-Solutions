class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int x : nums1) set1.add(x);
        for(int x : nums2) set2.add(x);

        List<Integer> result = new ArrayList<Integer>();

        for(int x : set1){
            if(set2.contains(x)){
                result.add(x);
            }
        }

        int[] ans = new int[result.size()]; // Int[] mai convert honi ki liye!

        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i); // result ko copy kro ans[i] mai. . .
        }
        return ans;
    }
}