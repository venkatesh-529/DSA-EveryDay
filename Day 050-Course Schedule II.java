class Solution {
    public int[] findOrder(int n, int[][] edges) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        Map<Integer,Integer> in=new HashMap<>();
        for(int i=0;i<n;i++) {
            mp.put(i,new ArrayList<>());
            in.put(i,0);
        }
        for(int[] a:edges){
            mp.get(a[1]).add(a[0]);
            in.put(a[0],in.getOrDefault(a[0],0)+1);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int x:in.keySet()){
            if(in.get(x)==0) {
                q.add(x);
            }
        }
        int order[]=new int[n];
        int c=0;
        while(!q.isEmpty()){
            int x=q.remove();
            order[c++]=x;
            for(int ele:mp.get(x)){
                in.put(ele,in.get(ele)-1);
                if(in.get(ele)==0){
                    q.add(ele);
                }
            }
        }
        if(c==n) return order;
        else return new int[0];
    }
}