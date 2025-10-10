class Solution {
    public int maximumEnergy(int[] e, int k) {
        int pre[]=new int[e.length];
        int max=Integer.MIN_VALUE;
        for(int i=e.length-1;i>=0;i--){
            if(i+k<=e.length-1) pre[i]=pre[i+k]+e[i];
            else pre[i]=e[i];
            max=Math.max(max,pre[i]);
        }
        return max;
    }
}