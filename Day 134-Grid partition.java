class Solution {
    public boolean canPartitionGrid(int[][] g) {
        int r=g.length;
        int c=g[0].length;
        long sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=g[i][j];
            }
        }
        if(sum%2!=0) return false;
        long s=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                s+=g[i][j];
            }
            if(s==sum/2) return true;
        }
        s=0;
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                s+=g[i][j];
            }
            if(s==sum/2) return true;
        }
        return false;
    }
}