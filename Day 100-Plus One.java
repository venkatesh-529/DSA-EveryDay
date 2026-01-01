import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] d) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<d.length;i++){
            s.append(d[i]);
            System.out.println(d[i]);
        }
       // s.append('0');
        BigInteger b=new BigInteger(s.toString());
        BigInteger b1=b.add(BigInteger.ONE);
        int l=b1.toString().length();
        String str=b1.toString();
        int ans[]=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=str.charAt(i)-48;
        } 
        return ans;
    }
    
}