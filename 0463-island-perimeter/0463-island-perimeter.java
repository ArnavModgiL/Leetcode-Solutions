class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;
        for(int i = 0; i<rows;i++){
            for(int j = 0; j< cols;j++){
                if(grid[i][j] == 1){
                    count = count + 4;

                    if(j < cols - 1) {
                        if(grid[i][j+1] == 1){
                            count = count - 2;
                        } 
                    }
                        if(i < rows - 1) {
                            if(grid[i + 1][j] == 1){
                                count = count - 2;
                            }
                        }
                }
            }  
        }
        return count;
    }
}