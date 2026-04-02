class Solution {
    public int maximumAmount(int[][] coins) {
        int n=coins.length;
        int m=coins[0].length;
        int dp[][][]=new int[n][m][3];
        for(int x[][]:dp){
            for(int y[]:x){
                Arrays.fill(y,-10000);
            }
        }
        return dfs(coins,dp,n,m,0,0,0);
    }
    public int dfs(int a[][],int dp[][][],int n,int m,int i,int j,int k){
        
        if(i>=n||j>=m) return -1000000;
        if (i == n - 1 && j == m - 1) {
            if (a[i][j] < 0 && k < 2) return 0; 
            return a[i][j];
        }

        if(dp[i][j][k]!=-10000) return dp[i][j][k];
        int p=a[i][j]+dfs(a,dp,n,m,i,j+1,k);
        int q=a[i][j]+dfs(a,dp,n,m,i+1,j,k);
        int r=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        if(k!=2 && a[i][j]<0){
            r=dfs(a,dp,n,m,i,j+1,k+1);
            s=dfs(a,dp,n,m,i+1,j,k+1);
        }
        return dp[i][j][k]=Math.max(Math.max(r,s),Math.max(p,q));
    }
}