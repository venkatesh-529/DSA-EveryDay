class Solution {
    public int minOperations(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1') cnt++;
            }else{
                if(s.charAt(i)=='0') cnt++;
            }
        }
        return Math.min(cnt,s.length()-cnt);
    }
}