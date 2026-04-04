class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int a[]:matches){
            m.put(a[0],0);
            m.put(a[1],0);
        }
        for(int a[]:matches){
            m.put(a[1],m.get(a[1])+1);
        }
        List<Integer> one=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        
        for(int ele:m.keySet()){
            if(m.get(ele)==0) one.add(ele);
            if(m.get(ele)==1) two.add(ele);
        }
        Collections.sort(one);
        Collections.sort(two);
        l.add(one);
        l.add(two);
        return l;
    }
}