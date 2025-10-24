class BeingZero {
    public List<Integer> productQueries(int n, List<List<Integer>> q) {
        List<Integer> res = new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        int pow=1;
        while(n>0){
            if((n&1)==1) p.add(pow);
            pow*=2;
            n>>=1;
        }
        int m=1000000007;
        for(List<Integer> l:q){
            long pr=1;
            
            for(int i=l.get(0);i<=l.get(1);i++){
                pr=((pr%m)*(p.get(i))%m)%m;
            }
            res.add((int)pr);
        }
        return res;
    }
}