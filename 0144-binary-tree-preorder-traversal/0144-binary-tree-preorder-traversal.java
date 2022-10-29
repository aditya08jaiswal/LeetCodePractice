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
    
    private List<Integer> result;
    
    private void traverse(TreeNode root) {

        if (root == null) return;
        
        result.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        result = new ArrayList<>();
        
        traverse(root);
        
        return result;
    }
}