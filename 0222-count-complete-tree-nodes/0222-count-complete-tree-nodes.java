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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftCount=getHeight(root.left);
        int rightCount=getHeight(root.right);
        if(leftCount==rightCount){
            return (1<<leftCount)+countNodes(root.right);
        }
        else{
            return (1<<rightCount)+countNodes(root.left);
        }
    }
    private static int getHeight(TreeNode root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
}