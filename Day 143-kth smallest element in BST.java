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
    int x=0,c=0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return x;
    }
    void dfs(TreeNode r,int k){
        if(r==null || c>=k) return ;
        dfs(r.left,k);
        c++;
        if(c==k){
            x=r.val;
            return;
        }
        dfs(r.right,k);
    }
}