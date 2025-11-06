class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(Math.abs(a-x)==Math.abs(b-x)) return a-b;
            return Math.abs(a-x)-Math.abs(b-x);
        });
        for(int ele:arr) pq.add(ele);
        List<Integer> l=new ArrayList<>();
        while(k-->0) l.add(pq.remove());
        Collections.sort(l);
        return l;
    }
}