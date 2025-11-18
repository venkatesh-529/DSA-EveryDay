class BeingZero {
    public int solve(int n , int e, int[][] edges) {
        //Input and output are handled complete the function and return the required answer
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=1;i<=n;i++) m.put(i,new ArrayList<>());
        for(int[] ed:edges){
            m.get(ed[0]).add(ed[1]);
            m.get(ed[1]).add(ed[0]);
        }
        int ans = 0;
        boolean vis[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                dfs(m,vis,i);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(Map<Integer,List<Integer>> m,boolean[] vis,int cur){
        vis[cur]=true;
        for(int n:m.get(cur)){
            if(!vis[n]) dfs(m,vis,n);
        }
    }
}