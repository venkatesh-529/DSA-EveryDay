class Solution {
    public boolean completePrime(int num) {
        if(num<10) return isprime(num);
        String s=String.valueOf(num);
        for(int i=1;i<=s.length();i++){
            int n=Integer.parseInt(s.substring(0,i));
            if(!isprime(n)) return false;
            int n1=Integer.parseInt(s.substring(s.length()-i));
            if(!isprime(n1)) return false;
        }
        return true;
    }
    public boolean isprime(int x){
        if(x<2) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        for(int i=3;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
}©leetcode