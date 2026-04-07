class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Map<String,Integer> m=new HashMap<>();
        for(int a[]:obstacles) m.put(a[0]+"*"+a[1],0);
        int cdir=0;
        int directions[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int maxd=0;
        int[] cpos={0,0};
        for(int x:commands){
            if(x==-1){
                cdir=(cdir+1)%4;
                continue;
            }
            if(x==-2) {
                cdir=(cdir+3)%4;
                continue;
            }
            for(int step=0;step<x;step++){
                int newx=directions[cdir][0]+cpos[0];
                int newy=directions[cdir][1]+cpos[1];
                if(m.containsKey(newx+"*"+newy)) break;
                cpos[0]=newx;
                cpos[1]=newy;
            }
            maxd=Math.max(maxd,cpos[0]*cpos[0]+cpos[1]*cpos[1]);
        }
        return maxd;
    }
}