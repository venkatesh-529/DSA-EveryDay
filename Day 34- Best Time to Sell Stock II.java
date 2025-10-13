class Solution {
    public int maxProfit(int[] a) {
        int sum=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]) sum+=a[i]-a[i-1];
        }
        return sum;
    }
}