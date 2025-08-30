class Solution {
    public int minEatingSpeed(int[] p, int n) {
        int l=1,h=1000000000;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isPossible(p,m,n)){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    public static boolean isPossible(int[] a,int k,int h){
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i]/k;
            if(a[i]%k!=0)sum++;
        }
        return sum<=h;
    }
}