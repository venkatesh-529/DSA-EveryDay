class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> l=new ArrayList<>();
            while(!s1.isEmpty()){
                TreeNode f=s1.pop();
                l.add(f.val);
                if(f.left!=null) s2.add(f.left);
                if(f.right!=null) s2.add(f.right);
            }
            if (!l.isEmpty()) ans.add(new ArrayList<>(l));
            l.clear();
            while(!s2.isEmpty()){
                TreeNode f=s2.pop();
                l.add(f.val);
                if(f.right!=null) s1.add(f.right);
                if(f.left!=null) s1.add(f.left);
            }
            if (!l.isEmpty()) ans.add(new ArrayList<>(l));
            l.clear();
            
        }
        return ans;
    }
}