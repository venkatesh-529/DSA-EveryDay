class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(n==1 && grid[0][0]==0) return 1;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;
        Queue<int[]> pq=new LinkedList<>();
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dist[i],Integer.MAX_VALUE);
        int dr[]={-1,-1,0,1,1,1,0,-1};
        int dc[]={0,1,1,1,0,-1,-1,-1};
        pq.add(new int[]{1,0,0});
        while(!pq.isEmpty()){
            int x[]=pq.poll();
            int d=x[0];
            int r=x[1];
            int c=x[2];
            grid[r][c]=1;
            for(int i=0;i<8;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0&& nr<n &&nc<n &&grid[nr][nc]==0&&d+1<dist[nr][nc] ){
                    dist[nr][nc]=1+d;
                    if(nr==n-1 && nc==n-1) return dist[nr][nc];
                    pq.add(new int[]{dist[nr][nc],nr,nc});
                }
            }
        }
        return -1;
    }
}