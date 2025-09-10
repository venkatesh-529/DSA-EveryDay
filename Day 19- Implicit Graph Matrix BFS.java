import java.util.*;
import java.io.*;
class BeingZero {
    public int[][] solve(int r, int c, int si, int sj) {
        int ans[][] = new int[r][c];
        boolean v[][] = new boolean[r][c];
        Queue<pairs> q=new LinkedList<>();
        q.add(new pairs(si,sj));
        v[si][sj]=true;
        int val=1;
        int di[]={-1,-1,0,1,1,1,0,-1};
        int dj[]={0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){
            pairs p=q.remove();
            int i=p.i;
            int j=p.j;
            ans[i][j]=val++;
            for(int d=0;d<8;d++){
                int ni=i+di[d];
                int nj=j+dj[d];
                if(isValid(ni,nj,r,c) && !v[ni][nj]){
                    q.add(new pairs(ni,nj));
                    v[ni][nj]=true;
                }
            }
            
        }
        return ans;
    }
    public boolean isValid(int i,int j,int r,int c){
        return i>=0 && j>=0 && i<r && j<c;
    }
    public class pairs{
        int i,j;
        public pairs(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
}