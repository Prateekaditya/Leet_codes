class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Pair of value and original index
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Pick top k
        int[][] topK = Arrays.copyOfRange(arr, 0, k);

        // Sort top k by original index to preserve order
        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        // Extract result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }

        return result;
    }
}
