class Solution {
    public int mirrorDistance(int n) {
        int x=reverse(n);
        return Math.abs(n-x);
    }
    public int reverse(int n){
        int x=0;
        while(n>0){
            int rem=n%10;
            x=x*10+rem;
            n/=10;
        }
        return x;
    }
}