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
    public List<List<String>> printTree(TreeNode root) {
        int h=height(root);
        String[][] s=new String[h][(1<<h)-1];
        for(String a[]:s) Arrays.fill(a,"");
        List<List<String>> ans=new ArrayList<>();
        helper(s,root,0,0,s[0].length);
        for(String arr[]:s) ans.add(Arrays.asList(arr));
        return ans;
    }
    public void helper(String[][] s,TreeNode root,int row,int left,int right){
        if(root==null) return;
        s[row][(left+right)/2]=""+root.val;
        helper(s,root.left,row+1,left,(left+right)/2);
        helper(s,root.right,row+1,(left+right)/2+1,right);
    }
    public int height(TreeNode r){
        if(r==null) return 0;
        return 1+Math.max(height(r.left),height(r.right));
    }
}