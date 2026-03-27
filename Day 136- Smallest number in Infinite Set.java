class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    HashMap<Integer,Integer> m;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>(); 
        m=new HashMap<>();
        for(int i=1;i<1001;i++){
             pq.add(i);
             m.put(i,1);
        }
    }
    
    public int popSmallest() {
        int x= pq.poll();
        m.remove(x);
        return x;
    }
    
    public void addBack(int num) {
        if(!m.containsKey(num)) {
            pq.add(num);
            m.put(num,1);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */