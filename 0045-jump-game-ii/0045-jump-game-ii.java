class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return 0;
        }
        if(nums[0]==0){
            return -1;
        }
        int maxReach=nums[0];
        int steps=nums[0];
        int jumps=1;
        for(int i=1;i<n;i++){
            if(i==n-1){
                return jumps;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=maxReach) return -1;
                steps=maxReach-i;
            }
        }
        return -1;
    }
}