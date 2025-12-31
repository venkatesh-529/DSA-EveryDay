import java.util.*;
import java.io.*;

class BeingZero {
    String solve(int a, int b, int c, int x, int y) {
        //String ans = "YES";
        //Complete the function
        int ans=0;
        if(a<x){
            ans+=x-a;
        }
        if(b<y){
            ans+=y-b;
        }
        if(ans>0) ans-=c;
        return ans<=0?"YES":"NO";
    }
}