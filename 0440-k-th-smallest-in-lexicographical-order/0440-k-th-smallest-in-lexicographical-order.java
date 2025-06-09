class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k = k - 1; // because we start from 1
        
        while (k > 0) {
            long steps = countSteps(curr, n);
            if (steps <= k) {
                // Skip this whole subtree
                curr++;
                k -= steps;
            } else {
                // Go deeper in the tree
                curr *= 10;
                k--;
            }
        }
        return curr;
    }

    private long countSteps(long curr, long n) {
        long steps = 0;
        long first = curr;
        long last = curr;

        while (first <= n) {
            steps += Math.min(n, last) - first + 1;
            first *= 10;
            last = last * 10 + 9;
        }

        return steps;
    }
}
