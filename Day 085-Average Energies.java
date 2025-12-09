import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
            List<Integer> l=new ArrayList<>();
        while(sc.hasNextInt()){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        if(l.size()<=2){
            System.out.println("0");
            return;
        }
        long sum=0;int c=0;
        int min=l.get(0);
        int max=l.get(l.size()-1);
        for(int i=0;i<l.size();i++){ 
            if(l.get(i)!=max && l.get(i)!=min) {
            sum+=l.get(i);
            c++;
            }
        }
        System.out.println((int)Math.round(sum*1.0/c));
    }
}