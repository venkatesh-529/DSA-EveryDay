class Solution {
        int ung=0;
        int gd=1;
        int ga=2;
        int w=3;
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int g[][]=new int[m][n];
        for(int gau[]:guards) g[gau[0]][gau[1]]=ga;
        for(int wa[]:walls) g[wa[0]][wa[1]]=w;
        for (int[] guard : guards) {
            helper(guard[0] - 1, guard[1], g, 'U'); 
            helper(guard[0] + 1, guard[1], g, 'D'); 
            helper(guard[0], guard[1] - 1, g, 'L'); 
            helper(guard[0], guard[1] + 1, g, 'R'); 
        }
        int c=0;
        for(int[] x:g){
            for(int ele:x)if(ele==ung) c++;
        }
        return c;
    }
    public void helper(int r,int c,int[][] g,char d){
        if(r<0||r>=g.length||c<0||c>=g[0].length||g[r][c]==ga||g[r][c]==w)return;
        g[r][c]=gd;
        if(d=='U') helper(r-1,c,g,d);
        if(d=='D') helper(r+1,c,g,d);
        if(d=='L') helper(r,c-1,g,d);
        if(d=='R') helper(r,c+1,g,d);
    }
}