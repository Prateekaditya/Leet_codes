class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n =nums.length ;
        if(n==0){
            return 0;
        }
        int max=1;
        int incLen=1;
        int dec=1;
        for(int i=1;i<n;i++){
                        if (nums[i] > nums[i - 1]) {
                incLen++; 
                dec = 1; 
            } else if (nums[i] < nums[i - 1]) {
                dec++; 
                incLen = 1; 
            } else {
                incLen = 1;
                dec = 1;
            }
            max=Math.max(max,Math.max(incLen,dec));
        }
        return max;
    }
}