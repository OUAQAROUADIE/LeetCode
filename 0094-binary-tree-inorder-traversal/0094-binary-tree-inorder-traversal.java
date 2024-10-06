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
       List<Integer> result = new ArrayList<>();
       return inorder(root, result); 
    }

    public List<Integer> inorder(TreeNode n, List<Integer> r){
        if( n != null){
            inorder(n.left, r);
            r.add(n.val);
            inorder(n.right, r);
        }
        return r;
    }
    
    
    
    

    
}