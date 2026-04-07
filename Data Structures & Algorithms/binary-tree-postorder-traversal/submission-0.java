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
    ArrayList<Integer> post_order;
    public List<Integer> postorderTraversal(TreeNode root) {
        post_order= new ArrayList<>();
        postOrder(root);
        return post_order;
    }
    private void postOrder(TreeNode node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        post_order.add(node.val);
    }
}