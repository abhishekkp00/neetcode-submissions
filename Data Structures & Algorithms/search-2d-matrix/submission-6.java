class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowL = matrix.length;
        int colL = matrix[0].length;

        int st = 0;
        int end = rowL * colL - 1;


        while(st <= end){
            int mid = st + (end - st) / 2;

            int row = mid / colL;
            int col = mid % colL;

            if(matrix[row][col] == target) return true;

            else if(matrix[row][col] < target){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    
    }
}
