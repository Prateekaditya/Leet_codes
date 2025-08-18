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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ldiam=diameterOfBinaryTree(root.left);
        int lht=height(root.left);
        int rdiam=diameterOfBinaryTree(root.right);
        int rht=height(root.right);
        int selfDiam = lht+rht+2;
        return Math.max(Math.max(ldiam,rdiam),selfDiam);
    }
    public static int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
}