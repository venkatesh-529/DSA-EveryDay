class Solution {
    public int minCost(int n, int[][] edges) {
        Map<Integer,List<pair>> m=new HashMap<>();
        for(int i=0;i<n;i++)m.put(i,new ArrayList<>());
        for(int e[]:edges){
            int x=e[0];
            int y=e[1];
            int w=e[2];
           m.get(x).add(new pair(y,w));
           m.get(y).add(new pair(x,2*w));
        }
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        boolean[] b=new boolean[n];
        PriorityQueue<Node> pq=new PriorityQueue<>((a, b1) -> Integer.compare(a.d, b1.d));
        pq.add(new Node(0,0));
        while(!pq.isEmpty()){
            Node curr=pq.remove();
            int adj=curr.c;
            if(adj==n-1) return curr.d;
            if(b[adj]) continue;
            b[adj]=true;
            for(pair p:m.get(adj)){
                int node=p.n;
                int wt=p.w;
                if(!b[node] &&  dist[adj]+wt<dist[node]){
                    dist[node]=dist[adj]+wt;
                    pq.add(new Node(node,dist[node]));
                }
            }
        }
        return -1;
    }
    static class pair{
        int n;
        int w;
        public pair(int n,int w){
            this.n=n;
            this.w=w;
        }
    }
    static class Node{
        int c;
        int d;
        public Node(int c,int d){
            this.c=c;
            this.d=d;
        }
    }
}