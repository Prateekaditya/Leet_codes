class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(left<right){
            int water=Math.min(height[left],height[right])*(right-left);
            ans=Math.max(ans,water);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return ans;
    }
}