import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int minCost=Integer.MAX_VALUE;
		    for (int i = 0; i <= n / 2; i++) {
                int f = i*2; 
                int rem= n-f;
                if (rem >= 0 && rem % 3 == 0) {
                    int j = rem / 3;
                    int cost = i * 4 + j * 5; 
                    minCost = Math.min(minCost, cost);
                }   
            }
            System.out.println(minCost);
		}

	}
}
