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
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         ans=new ArrayList<>();
        dfs(root,targetSum,new ArrayList<>());
        return ans;
    }
    public void dfs(TreeNode r,int t,List<Integer> l){
        if(r==null) return;
        l.add(r.val);
        t-=r.val;
        if(r.left==null&&r.right==null && t==0){
            ans.add(new ArrayList<>(l));
        }
        dfs(r.left,t,l);
        dfs(r.right,t,l);
        l.remove(l.size()-1);
    }
}