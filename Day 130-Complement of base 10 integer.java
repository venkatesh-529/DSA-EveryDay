class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuffer sb=new StringBuffer();
        for(char ch:s.toCharArray()){
            sb.append(ch=='0'?'1':'0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}