class RideSharingSystem {
    Queue<Integer> r; 
    Queue<Integer> d; 
    Queue<Integer> a;
    
    public RideSharingSystem() {
       r=new LinkedList<>(); 
       d=new LinkedList<>(); 
       a=new LinkedList<>(); 
    }
    
    public void addRider(int riderId) {
        r.add(riderId);
        a.add(riderId);
    }
    
    public void addDriver(int driverId) {
        d.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!r.isEmpty() && !a.contains(r.peek())){
            r.poll();
        }
        if(r.isEmpty()||d.isEmpty()) return new int[]{-1,-1};
        int x=d.poll();
        int y=r.poll();
        a.remove(y);
        return new int[]{x,y};
    }
    
    public void cancelRider(int riderId) {
        a.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */