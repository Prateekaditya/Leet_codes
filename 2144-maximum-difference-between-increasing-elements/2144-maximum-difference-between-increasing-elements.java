class Solution {
    public int maximumDifference(int[] nums) {
        int minPrice =nums[0];
        int maxDiff=-1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>minPrice){
                maxDiff=Math.max (maxDiff,nums[j]-minPrice);
            }
            minPrice=Math.min(nums[j],minPrice);
        }
        return maxDiff;
    }
}