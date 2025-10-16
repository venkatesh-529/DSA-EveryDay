class Solution {
    public int nextGreaterElement(int n) {
        List<Integer> l=new ArrayList<>();
        int temp=n;
        while(temp>0){
            l.add(temp%10);
            temp/=10;
        }
        Collections.reverse(l);
        int idx=-1;
        for(int i=l.size()-2;i>=0;i--){
                if(l.get(i+1)>l.get(i)){
                    idx=i;
                    break;
                }
        }
        if(idx==-1) return -1;
        int greater=-1;
        for(int i=l.size()-1;i>idx;i--){
            if(l.get(i)>l.get(idx)){
                greater=i;
                break;
            }
        }
        Collections.swap(l,idx,greater);
        reverse(idx+1,l.size()-1,l);
        long x=0;
        for(int ele:l) x=x*10+ele;
        return x>Integer.MAX_VALUE?-1:(int)x;
    }
    void reverse(int s,int e,List<Integer> l){
        int le=s,r=e;
        while(le<=r){
            Collections.swap(l,le,r);
            le++;
            r--;
        }
    }
}