class LRUCache {
    Map<Integer,Integer> m=new LinkedHashMap<>();
    int c;
    public LRUCache(int capacity) {
        c=capacity;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            int val=m.get(key);
            m.remove(key);
            m.put(key,val);
            return val;
        }else return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)) m.remove(key);
        m.put(key,value);
        if(m.size()>c) del(m);
    }
    public void del(Map<Integer,Integer> m){
        for(int ele:m.keySet()) {
            m.remove(ele);
            break;
        }
    }
}