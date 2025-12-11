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
            int c=sc.nextInt();
            if(((b*b)-(4*a*c))>=0){
                int d1=(int)Math.sqrt((b*b)-(4*a*c));
                int x=((-b+d1)/(2*a));
                int y=((-b-d1)/(2*a));
                if(x!=y){
                    int m=Math.min(x,y);
                    int n=Math.max(x,y);
                    System.out.println("Two roots:"+" "+m+" "+ n);
                }
                else{
                    System.out.println("One root:"+" "+x);
                    
                }
            }
            else System.out.println("No roots");
        }
    }
}