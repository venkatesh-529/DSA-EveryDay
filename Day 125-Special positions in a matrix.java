class Solution {
    public int numSpecial(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int cnt=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0) continue;
                boolean x=true;
                for(int k=0;k<r;k++){
                    if(k!=i && mat[k][j]==1) {
                        x=false;
                        break;
                    }
                }
                for(int k=0;k<c;k++){
                    if(k!=j&&mat[i][k]==1) {
                        x=false;
                        break;
                    }
                }
                if(x) cnt++;
            }
           
        }
        return cnt;
    }
}