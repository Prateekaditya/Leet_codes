class Solution {
    public int search(int[] nums, int target) {
        int matrix[][] = new int[nums.length][2];
        for(int i=0; i< nums.length; i++){
            matrix[i][0] = i;
            matrix[i][1] = nums[i];
        }
        Arrays.sort(matrix, Comparator.comparingInt(o -> o[1]));
        for(int i=0; i< matrix.length; i++){
            if(matrix[i][1] == target){
                return matrix[i][0];
            }
        }
        return -1;
    }
}