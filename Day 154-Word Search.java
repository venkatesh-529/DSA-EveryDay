class Solution {
    int m,n;
    public boolean exist(char[][] board, String word) {
         m=board.length;
         n=board[0].length;
        boolean v[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!v[i][j]&&board[i][j]==word.charAt(0)){
                    StringBuffer sb=new StringBuffer();
                    if(dfs(i, j,board,v,sb,word)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,char[][] b,boolean[][] v,StringBuffer sb,String s){
        if(i<0||j<0||i>=m||j>=n||v[i][j]) return false;
        sb.append(b[i][j]);
        if(sb.charAt(sb.length()-1)!=s.charAt(sb.length()-1)){
            sb.deleteCharAt(sb.length()-1);
            return false;
        }
        if(sb.length()==s.length()) return true;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
    
        v[i][j]=true;
        for(int k=0;k<4;k++){
            int ni=i+dr[k];
            int nj=j+dc[k];
            if(dfs(ni,nj,b,v,sb,s)){
                return true;
            }
        }

        v[i][j]=false;
        sb.deleteCharAt(sb.length()-1);
        return false;
    }
}