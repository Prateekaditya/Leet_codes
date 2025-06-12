class Solution {
    public int maxAdjacentDistance(int[] nums) {
        // Arrays.sort(nums);
        int n= nums.length;
        int max= Math.abs(nums[0]-nums[n-1]);
        for(int i=0;i<n-1;i++){
            max = Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        return max;
    }
}