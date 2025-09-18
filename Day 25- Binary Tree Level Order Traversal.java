class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            while(s-->0){
                TreeNode n=q.poll();
                l.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            ans.add(l);
        }
        return ans;
    }
}