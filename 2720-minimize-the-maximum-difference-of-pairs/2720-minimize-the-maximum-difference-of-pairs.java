import java.util.Arrays;

class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p == 0) return 0;
        
        Arrays.sort(nums);
        int n = nums.length;
        
        // Binary search on the answer
        int left = 0;
        int right = nums[n - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canFormPairs(nums, p, mid)) {
                right = mid;  // Try for smaller max difference
            } else {
                left = mid + 1;  // Need larger max difference
            }
        }
        
        return left;
    }
    
    // Greedy function to check if we can form p pairs with max difference <= maxDiff
    private boolean canFormPairs(int[] nums, int p, int maxDiff) {
        int pairs = 0;
        int i = 0;
        
        while (i < nums.length - 1 && pairs < p) {
            // If current adjacent pair has difference <= maxDiff, take it
            if (nums[i + 1] - nums[i] <= maxDiff) {
                pairs++;
                i += 2;  // Skip both elements (they're used)
            } else {
                i++;     // Move to next element
            }
        }
        
        return pairs >= p;
    }
}
