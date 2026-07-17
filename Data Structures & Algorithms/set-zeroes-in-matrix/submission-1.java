class Solution {
    public void setZeroes(int[][] matrix) {

        int[] tempRow = new int[matrix.length];
        int[] tempCol = new int[matrix[0].length];
 
        Arrays.fill(tempRow, -1);
        Arrays.fill(tempCol, -1);

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    tempRow[i] = 0;
                    tempCol[j] = 0;
                }
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(tempRow[i] == 0 || tempCol[j] == 0){
                    matrix[i][j] = 0;
                }
            }
            
        }
    }
}
