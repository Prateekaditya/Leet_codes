class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int idx=0;
        for(int i=nums.length;i<ans.length;i++){
            ans[i]=nums[idx];
            idx++;
        }
        return ans;
    }
}