class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int maxWater = 0;
        
        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int wt = rp - lp;
            int cw = ht * wt;
            maxWater = Math.max(cw, maxWater);
            
            // Move the pointer pointing to the shorter line
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
