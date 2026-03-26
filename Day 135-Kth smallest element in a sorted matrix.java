class Solution {
    public int kthSmallest(int[][] m, int k) {
        PriorityQueue<triplet> pq=new PriorityQueue<>((a,b)->a.ele-b.ele);
        int n=m.length;
        for(int i=0;i<n;i++){
            pq.add(new triplet(m[i][0],i,0));
        }
        int ans=0;
        while(k-->0){
            triplet c=pq.poll();
            ans=c.ele;
            if(c.col+1<n) pq.add(new triplet(m[c.row][c.col+1],c.row,c.col+1));
        }
        return ans;
    } 
}
public class triplet{
    int ele,row,col;
    public triplet(int ele,int row,int col){
        this.ele=ele;
        this.row=row;
        this.col=col;
    }
}