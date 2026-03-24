class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=12345;
        int m1=grid[0].length;
        int a[]=new int[n*m1];
        int l[]=new int[n*m1];
        int r[]=new int[n*m1];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m1;j++){
                a[k++]=grid[i][j];
            }
        }
        l[0]=1;
        for(int i=1;i<n*m1;i++){
            l[i]=((l[i-1]%m)*(a[i-1]%m))%m;
        }
        r[r.length-1]=1;
        for(int i=(n*m1)-2;i>=0;i--){
            r[i]=((r[i+1]%m)*(a[i+1]%m))%m;
        }
        k=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m1;j++){
             grid[i][j]=((l[k]%m)*(r[k]%m))%m;
             k++;
           } 
        }
        return grid;

    }
}