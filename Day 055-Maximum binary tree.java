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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0,nums.length,nums);
    }
    public TreeNode helper(int l,int r,int[] a){
        if(l==r) return null;
        int max=max(l,r,a);
        TreeNode root=new TreeNode(a[max]);
        root.left=helper(l,max,a);
        root.right=helper(max+1,r,a);
        return root;
    }
    public int max(int l,int r,int[] a){
        int maxi=l;
        for(int i=l;i<r;i++){
            if(a[maxi]<a[i]) maxi=i;
        }
        return maxi;
    }
}