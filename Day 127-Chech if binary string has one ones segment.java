class Solution {
    public boolean checkOnesSegment(String s) {
       int max=0;
       int c=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && (i==0||s.charAt(i-1)=='0'))c++;
       }
       return c<=1; 
    }
}