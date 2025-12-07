import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long min=Math.min(a,b);
            long max=Math.max(a,b);
           // long x=Math.abs(a-b)-1;
            long c=max-min+1;
          System.out.println(a+b-c);
        }
    }
}