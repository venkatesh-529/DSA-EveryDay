class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                if(ismagic(grid,i,j)) ans++;
            }
        }
        return ans;
    }
    public boolean ismagic(int m[][],int r,int c){
        boolean s[]=new boolean[10];
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(m[i][j]<1||m[i][j]>9) return false;
                if(s[m[i][j]]) return false;
                s[m[i][j]]=true;
            }
        }
        int d1 =
            m[r][c] + m[r+ 1][c + 1] + m[r+ 2][c+ 2];
        int d2 =
            m[r+ 2][c] + m[r+ 1][c + 1] + m[r][c+ 2];
        if (d1 != d2) return false;
        int r1=m[r][c]+m[r][c+1]+m[r][c+2];
        int r2=m[r+1][c]+m[r+1][c+1]+m[r+1][c+2];
        int r3=m[r+2][c]+m[r+2][c+1]+m[r+2][c+2];
        if(!(r1==d1&&r2==d1&&r3==d1)) return false;
        int c1=m[r][c]+m[r+1][c]+m[r+2][c];
        int c2=m[r][c+1]+m[r+1][c+1]+m[r+2][c+1];
        int c3=m[r][c+2]+m[r+1][c+2]+m[r+2][c+2];
        
        if(!(c1==d2&&c2==d2&&c3==d2)) return false;
        return true;
    }
}