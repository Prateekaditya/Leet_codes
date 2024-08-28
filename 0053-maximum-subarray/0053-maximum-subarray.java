class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            maxSum=Math.max(currentSum,maxSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int max = nums[0];

//         for(int i=0; i<nums.length; i++){
//             sum +=nums[i];
//             max = Math.max(sum , max);
//             if(sum < 0)
//                 sum = 0;
            
//         }

//         return max;
//     }

// }