class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int out[]=new int[n];
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            //l.add(new ArrayList<>());
            out[i]=graph[i].length;
            for(int no:graph[i]) l.get(no).add(i);
        }
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(out[i]==0) {
                q.add(i);
            }
        }
        List<Integer> li=new ArrayList<>();
        int c=0;
        while(!q.isEmpty()){
            int x=q.remove();
            li.add(x);
            for(int ele:l.get(x)){
                out[ele]--;
                if(out[ele]==0){
                    q.add(ele);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
}