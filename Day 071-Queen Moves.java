import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            long ans=n+m-2;
            ans+=Math.min(x-1,y-1);
            ans+=Math.min(m-x,n-y);
            ans+=Math.min(m-x,y-1);
            ans+=Math.min(x-1,n-y);
            System.out.println(ans);
        }
    }
}