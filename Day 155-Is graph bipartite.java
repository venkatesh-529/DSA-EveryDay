class Solution {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int color[]=new int[v];
        Arrays.fill(color,-1);
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(!(check(i,color,v,graph))) return false;
            }
        }
        return true;
    }
    public boolean check(int i,int[] c,int v,int[][] graph){
        Queue<Integer> q=new LinkedList<>();
        c[i]=0;
        q.add(i);
        while(!q.isEmpty()){
            int n=q.poll();
            for(int ele:graph[n]){
                if(c[ele]==-1){
                    c[ele]=1-c[n];
                    q.add(ele);
                }else if(c[n]==c[ele]) return false;
            }
        }
        return true;
    }
}