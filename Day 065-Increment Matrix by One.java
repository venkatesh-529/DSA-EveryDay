class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int m[][]=new int[n][n];
        for(int a[]:queries){
            for(int i=a[0];i<=a[2];i++){
                for(int j=a[1];j<=a[3];j++){
                    m[i][j]++;
                }
            }
        }
        return m;
    }
}