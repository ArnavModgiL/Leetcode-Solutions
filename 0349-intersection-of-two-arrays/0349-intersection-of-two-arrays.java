class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int x : nums1) set1.add(x);
        for(int x : nums2) set2.add(x);

        List<Integer> result = new ArrayList<Integer>();

        for(int x : set1){ // loop from x too set1.length tkh . . .
            if(set2.contains(x)){ // if set2 contains x . . 
                result.add(x); // result main add kro.
            }
        }

        int[] ans = new int[result.size()]; // Int Array bniye okie . . .

        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i); // result ki sare element isme copy krdo.
        }
        return ans; // return ans krdo chlo.!
    }
}