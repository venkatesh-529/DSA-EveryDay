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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root==null) return ans;
        Map<Integer,TreeMap<Integer,List<Integer>>> m=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0,0));
        while(!q.isEmpty()){
            pair p=q.remove();
            int level=p.v;
            TreeNode node=p.t;
            int hor=p.h;
            if(m.containsKey(level)){
                if(m.get(level).containsKey(hor))
                   m.get(level).get(hor).add(node.val);
                else{
                    m.get(level).put(hor,new ArrayList<>());
                    m.get(level).get(hor).add(node.val);
                }
            }
            else{
                m.put(level,new TreeMap<Integer,List<Integer>>());
                m.get(level).put(hor,new ArrayList<>());
                m.get(level).get(hor).add(node.val);
            }
            if(node.left!=null){
                q.add(new pair(node.left,level-1,p.h+1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,level+1,p.h+1));
            }
        }
        for(int x:m.keySet()){
            List l=new ArrayList<>();
            //Collections.sort(l);
            for(int y:m.get(x).keySet()){
                List<Integer> a=m.get(x).get(y);
                Collections.sort(a);
                l.addAll(a);
            }
            ans.add(l);
        }
		return ans;
    }
}
class pair{
    int v;
    int h;
    TreeNode t;
    public pair(TreeNode t,int l,int h){
        this.t=t;
        v=l;
        this.h=h;
    }
}