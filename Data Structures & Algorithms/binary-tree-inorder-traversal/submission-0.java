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
    ArrayList<Integer> al;
    public List<Integer> inorderTraversal(TreeNode root) {
        al = new ArrayList<>();
        inorder(root);
        return al;
    }
    private void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        al.add(node.val);
        inorder(node.right);
    }
}