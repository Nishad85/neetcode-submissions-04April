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
    ArrayList<Integer> pre_order;
    public List<Integer> preorderTraversal(TreeNode root) {
        pre_order= new ArrayList<>();
        preOrder(root);
        return pre_order;
    }
    private void preOrder(TreeNode node){
        if(node==null){
            return;
        }
        pre_order.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}