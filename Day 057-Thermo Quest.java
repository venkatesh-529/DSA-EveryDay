class BeingZero {
    public int solve(int[] a, int N, int d) {
        // TODO: Complete this function
        // You need to compute and return the minimum number of suit switches
        int ans=0;
        boolean v=false;
        for(int i=0;i<N;i++){
            if(a[i]>d){
                if(!v){
                    ans++;
                    v=true;
                }
            }
            else{
                if(v){
                    ans++;
                    v=false;
                }
            }
        }
        return ans; // placeholder
    }
}
