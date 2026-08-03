class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++){
            int row = 0;
            int col = n - 1;

            while(row < col) {
                int temp = matrix[i][row];
                matrix[i][row] = matrix[i][col];
                matrix[i][col] = temp;

                row++;
                col--;
            }
        }
    }
}