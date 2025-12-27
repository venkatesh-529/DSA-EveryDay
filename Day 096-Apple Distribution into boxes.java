class Solution {
    public int minimumBoxes(int[] apple, int[] c) {
        int sum=0;
        for(int ele:apple) sum+=ele;
        Arrays.sort(c);
        int cnt=0;
        for(int i=c.length-1;i>=0;i--){
            sum-=c[i];
            cnt++;
            if(sum<=0) break;
        }
        return cnt;
    }
}