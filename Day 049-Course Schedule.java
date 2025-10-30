class Solution {
    public boolean canFinish(int n, int[][] edges) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        Map<Integer,Integer> in=new HashMap<>();
        for(int i=1;i<=n;i++) {
            mp.put(i-1,new ArrayList<>());
            in.put(i-1,0);
        }
        for(int[] a:edges){
            mp.get(a[0]).add(a[1]);
            in.put(a[1],in.getOrDefault(a[1],0)+1);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] v=new boolean[n];
        for(int x:in.keySet()){
            if(in.get(x)==0) {
                q.add(x);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int x=q.remove();
            c++;
            for(int ele:mp.get(x)){
                in.put(ele,in.get(ele)-1);
                if(in.get(ele)==0){
                    q.add(ele);
                }
            }
        }
        return c==n;
    }
}
