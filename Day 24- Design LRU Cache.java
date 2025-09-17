import java.util.*;

class LRU {
    int size;
    List<Integer> l;
    public LRU(int k) {
       size=k;
        l=new ArrayList<>();
    }

    public void add(int x) {
        if(l.contains(x)){
            for(int i=0;i<l.size();i++){
                if(l.get(i)==x) {
                    l.remove(i);
                    break;
                }
            }
            l.add(x);
        }
        else if(l.size()<size){
            l.add(x);
        }
        else {
            l.remove(0);
            l.add(x);
        }
    }

    public List<Integer> getCacheElements() {
        // Logic for getting cache elements
        List<Integer> ans = new ArrayList<>();
        return l;
    }
}