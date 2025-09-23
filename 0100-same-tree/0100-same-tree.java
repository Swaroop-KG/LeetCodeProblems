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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return p==q;
        }

        boolean isLeft=isSameTree(p.left,q.left);
        boolean isRight = isSameTree(p.right,q.right);
        
            return isLeft && isRight && p.val==q.val;
        
    }
}