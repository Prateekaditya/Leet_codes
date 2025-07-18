import java.util.*;

class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length, k = n / 3;
        long[] leftMins = new long[n];
        long[] rightMaxs = new long[n];

        PriorityQueue<Integer> maxLeft = new PriorityQueue<>(Collections.reverseOrder());
        long leftSum = 0;

        for (int i = 0; i < k; i++) {
            maxLeft.add(nums[i]);
            leftSum += nums[i];
        }
        leftMins[k - 1] = leftSum;

        for (int i = k; i < n - k; i++) {
            if (nums[i] < maxLeft.peek()) {
                leftSum += nums[i] - maxLeft.poll();
                maxLeft.add(nums[i]);
            }
            leftMins[i] = leftSum;
        }

        PriorityQueue<Integer> minRight = new PriorityQueue<>();
        long rightSum = 0;

        for (int i = n - 1; i >= n - k; i--) {
            minRight.add(nums[i]);
            rightSum += nums[i];
        }
        rightMaxs[n - k] = rightSum;

        for (int i = n - k - 1; i >= k - 1; i--) {
            if (nums[i] > minRight.peek()) {
                rightSum += nums[i] - minRight.poll();
                minRight.add(nums[i]);
            }
            rightMaxs[i] = rightSum;
        }

        long minDiff = Long.MAX_VALUE;
        for (int i = k - 1; i < n - k; i++) {
            minDiff = Math.min(minDiff, leftMins[i] - rightMaxs[i + 1]);
        }

        return minDiff;
    }
}