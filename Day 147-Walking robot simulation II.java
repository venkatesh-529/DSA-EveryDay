class Robot {
    int cpos[] = { 0, 0 };
    int m, n;
    int dr[] = { 1, 0, -1, 0 };
    int dc[] = { 0, 1, 0, -1 };
    int cdir;
    public Robot(int width, int height) {
        m = width;
        n = height;
        cdir = 0;
    }

    public void step(int num) {
        int p=2*(n+m)-4;
        num%=p;
        if(num==0){
            if(cpos[0]==0&&cpos[1]==0) cdir=3;
            return;
        }
        while (num > 0) {
            int steps = 0;
            if (cdir == 0)
                steps = m - 1 - cpos[0]; 
            else if (cdir == 1)
                steps = n - 1 - cpos[1]; 
            else if (cdir == 2)
                steps = cpos[0]; 
            else
                steps = cpos[1];

            if (num <= steps) {
                cpos[0] += dr[cdir] * num;
                cpos[1] += dc[cdir] * num;
                break;
            } else {
                cpos[0] += dr[cdir] * steps;
                cpos[1] += dc[cdir] * steps;
                num -= steps;
                cdir = (cdir + 1) % 4;
            }
        }
        //System.out.println(cpos[0]+" "+cpos[1]);
    }

    public int[] getPos() {
        return cpos;
    }

    public String getDir() {
        if (cdir == 0)
            return "East";
        else if (cdir == 1)
            return "North";
        else if (cdir == 2)
            return "West";
        else
            return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */