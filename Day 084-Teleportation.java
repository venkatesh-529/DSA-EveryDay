import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int min1=Math.abs(a-b);
            int a1=Math.min(a,b);
            int a2=Math.max(a,b);
            int x1=Math.min(x,y);
            int y1=Math.max(x,y);
            int min2=Math.abs(Math.abs(a1-x1)+Math.abs(a2-y1));
            System.out.println(Math.min(min1,min2));
        }
    }
}