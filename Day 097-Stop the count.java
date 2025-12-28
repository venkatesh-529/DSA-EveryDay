import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0,nc=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') c++;
                int tot=i+1;
                if(2*c>tot){
                    nc++;
                }
            }
            System.out.println(nc);
        }
	}
}
