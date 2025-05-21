/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        traverse(root,nums);
        return nums;
    }
    public static void traverse(TreeNode root,List<Integer> nums){
        if(root==null) return ;
        traverse(root.left,nums);
        nums.add(root.val);
        traverse(root.right,nums);
    }
}