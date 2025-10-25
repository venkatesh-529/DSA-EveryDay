class Solution {
    public String lexSmallest(String s) {
        String ans=s;
        int l=s.length();
        for(int k=1;k<=l;k++){
            String f=new StringBuffer(s.substring(0,k)).reverse().toString()+s.substring(k);
            if(f.compareTo(ans)<0) ans=f;
            String la=s.substring(0,l-k)+new StringBuffer(s.substring(l-k)).reverse().toString();
            if(la.compareTo(ans)<0) ans=la;
        }
        return ans;
    }
}©leetcode