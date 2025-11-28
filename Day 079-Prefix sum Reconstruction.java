import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long p[]=new long[n];
            long s[]=new long[n];
            for(int i=0;i<n;i++){
                p[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                s[n-1-i]=sc.nextLong();
            }
            long a[]=new long[n];
            a[0]=p[0];
            for(int i=1;i<n;i++) a[i]=p[i]-p[i-1];
            long b[]=new long[n];
            b[n-1]=s[n-1];
            for(int i=n-2;i>=0;i--) b[i]=s[i]-s[i+1];
            boolean ans=true;
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    ans=false;
                    break;
                }
            }
            if(ans){
                for(int i=0;i<n;i++) System.out.print(a[i]+" ");
                System.out.println();
            }else System.out.println("-1");
            
        }
    }
}