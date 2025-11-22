class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] b=new char[n][n];
        for(char ch[]:b) Arrays.fill(ch,'.');
        int leftrow[]=new int[n];
        int updiag[]=new int[2*n-1];
        int lowdiag[]=new int[2*n-1];
        helper(0,n,b,ans,leftrow,updiag,lowdiag);
        return ans;
    }
    public void helper(int col,int n,char[][] b,List<List<String>> ans,int[] leftrow,int[] updiag,int[] lowdiag){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(char a[]:b){
                temp.add(new String(a));
            }
            ans.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && lowdiag[row+col]==0 && updiag[n-1+col-row]==0){
                b[row][col]='Q';
                leftrow[row]=1;
                lowdiag[row+col]=1;
                updiag[n-1+col-row]=1;
                helper(col+1,n,b,ans,leftrow,updiag,lowdiag);
                 b[row][col]='.';
                leftrow[row]=0;
                lowdiag[row+col]=0;
                updiag[n-1+col-row]=0;
            }
        }
    }
}