class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int cols=matrix[0].length -1;
        while(row<matrix.length && cols>=0){
            if(matrix[row][cols]==target){
                return true;
            }
            else if(target<matrix[row][cols]){
                cols--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}