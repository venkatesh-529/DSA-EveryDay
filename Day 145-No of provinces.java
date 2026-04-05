class Solution {
    public int findCircleNum(int[][] isc) {
        int n=isc.length;
        boolean v[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!v[i]) {
                c++;
                dfs(i,v,isc);
            }
        }
        return c;
    }
    public void dfs(int node,boolean[] v,int[][] isc){
        v[node]=true;
        for(int i=0;i<isc.length;i++){
            if(!v[i] && isc[node][i]==1) dfs(i,v,isc);
        }
    }
}