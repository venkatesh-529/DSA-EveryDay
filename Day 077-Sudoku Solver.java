class Solution {
    public void solveSudoku(char[][] b){
        solve(b);
    }
    public boolean solve(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(int num=1;num<=9;num++){
                        if(possible(board,num,i,j)){
                            board[i][j]=(char)('0'+num);
                            if(solve(board)) return true;;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean possible(char[][] b,int num,int row,int col){
        for(int i=0;i<9;i++){
            if(b[i][col]==(char)('0'+num)) return false;
            if(b[row][i]==(char)('0'+num)) return false;
            if(b[3*(row/3)+i/3][3*(col/3)+i%3]==(char)('0'+num)) return false;
        }
        return true;
    } 
}