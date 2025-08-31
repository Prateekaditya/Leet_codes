class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int water=Math.min(height[left],height[right])*(right-left);
            ans=Math.max(ans,water);
            if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
        
    }
}