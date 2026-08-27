class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            int num = 1;
            for(int j = 0; j <= i; j++){
                list.add(num);
                num = num * (i - j) / (j + 1);
            }
            result.add(list);
        }
        return result;
    }
}