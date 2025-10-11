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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null && root.right==null) return null;
            else if(root.right==null){
                return root.left;
            }
            else if(root.left==null) return root.right;
            TreeNode x=findMax(root.left);
            root.val=x.val;
            root.left=deleteNode(root.left,x.val);
            return root;
        }
        else if(root.val<key){
             root.right= deleteNode(root.right,key);
             return root;
        }
        else  {
            root.left=deleteNode(root.left,key);
            return root;
        }
    }
    public TreeNode findMax(TreeNode r){
        if(r==null) return null;
        while(r.right!=null) r=r.right;
        return r;
    }
}