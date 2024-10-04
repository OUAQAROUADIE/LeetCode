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
    public boolean isBalanced(TreeNode root) {
        if(root == null  ){
            return true;
        }
       return height(root) != -1;


    }
    public int height(TreeNode n ){
        if(n == null){return 0;}

        int leftheight = height(n.left);
        if(leftheight == -1) return -1;

        int rightheight = height(n.right);
        if(rightheight == -1) return -1;

        if(Math.abs(rightheight -leftheight) > 1) return -1;

        return Math.max(leftheight, rightheight) + 1;
    }

}