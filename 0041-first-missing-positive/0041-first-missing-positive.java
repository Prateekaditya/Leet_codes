class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        boolean visted[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                visted[nums[i]-1]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!visted[i-1]){
                return i;
            }
        }
        return n+1;
    }
}