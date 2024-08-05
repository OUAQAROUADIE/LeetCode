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
       if(root == null){
        return true;
       }
    return verifier(root) !=0;
    }
    public int verifier(TreeNode node ){
        if(node == null){
            return 1;
        }

        int left = verifier(node.left);
        if(left == 0){
            return 0;
        }

        int right  = verifier(node.right);
        if(right == 0){
            return 0;
        }

        if(Math.abs(left-right) > 1){
            return 0;
        }

        return Math.max(left, right)+1;





    }


    
}
