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
    static int sum=0;
    public Solution(){
        sum=Integer.MIN_VALUE;
    }
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return sum;
    }
    public int pathsum(TreeNode r){
        if(r==null) return 0;
        int le=Math.max(0,pathsum(r.left));
        int ri=Math.max(0,pathsum(r.right));
        sum=Math.max(sum,le+ri+r.val);
        return Math.max(le,ri)+r.val;
    } 
}