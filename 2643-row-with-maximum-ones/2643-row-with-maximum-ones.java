class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0; // Stores the maximum number of 1s...
        int rowIndex = 0; // Stores the index of the row currently has the maximum number of 1s

        for(int i = 0; i < mat.length; i++) {
            int count = 0;
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > maxOnes) {
                maxOnes = count;
                rowIndex = i; // Checks if the current row has more 1s than the previous maximum...if yes! updates the maximum count and stores the current row index.
            }
        }
        return new int[]{rowIndex,maxOnes};
    }
}