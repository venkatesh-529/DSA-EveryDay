class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        int n=g.length;
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<n;i++) {
            if(!m.containsKey(g[i])) m.put(g[i],new ArrayList<>());
            m.get(g[i]).add(i);
            if(g[i]==m.get(g[i]).size()){
                l.add(m.get(g[i]));
                m.remove(g[i]);
            }
        }
        return l;
    }
}