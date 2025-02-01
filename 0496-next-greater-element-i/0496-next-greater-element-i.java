import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[nums1.length];

        // Step 1: Compute next greater elements for nums2
        int[] nge = new int[nums2.length]; // Stores next greater elements for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        // Step 2: Find the next greater element for each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nextGreater[i] = nge[j];
                    break;
                }
            }
        }

        return nextGreater;
    }
}


