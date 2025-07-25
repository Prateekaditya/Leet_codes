class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum=nums[nums.length-1];
        int prev=sum;
        for(int i=nums.length-2;i>=0 && nums[i]>0;prev=nums[i],i--){
            if(nums[i]!=prev){
                sum+=nums[i];
            }
        }
        return sum;
    }
}