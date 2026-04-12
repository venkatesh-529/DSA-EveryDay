class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[]=new int[n];
        for(int i=0;i<n;i++) dist[i]=Integer.MAX_VALUE;
        List<List<pair>> l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int arr[]:flights) l.get(arr[0]).add(new pair(arr[1],arr[2]));
        Queue<int[]> pq=new LinkedList<>();
        pq.add(new int[]{0,src,0});//stops,src,cost
        dist[src]=0;
        while(!pq.isEmpty()){
            int curr[]=pq.remove();
            int stops=curr[0];
            int dest=curr[1];
            int cost=curr[2];
            if(stops>k) continue;
            for(pair p:l.get(dest)){
                int d2=p.dest;
                int c=p.c;
                if(cost+c<dist[d2]&&stops<=k){
                    dist[d2]=cost+c;
                    pq.add(new int[]{stops+1,d2,cost+c});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}
class pair{
    int dest,c;
    public pair(int dest,int c){
        this.dest=dest;
        this.c=c;
    }
}