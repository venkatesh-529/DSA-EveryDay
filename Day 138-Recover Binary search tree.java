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
     TreeNode fst=null,sec=null,prev=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=fst.val;
        fst.val=sec.val;
        sec.val=temp;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null&&prev.val>root.val){
            if(fst==null) fst=prev;
            sec=root;
        }
        prev=root;
        inorder(root.right);
    }
}