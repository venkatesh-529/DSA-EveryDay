class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> inn=new ArrayList<>();
            while(s-->0){
                Node f=q.remove();
                inn.add(f.val);
                for(Node child:f.children)q.add(child);
            }
            result.add(inn);
        }
        return result;
    }
}