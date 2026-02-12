class Solution {
    public int longestBalanced(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int f[]=new int[26];
            for(int j=i;j<s.length();j++){
                f[s.charAt(j)-'a']++;
                if(bal(f)) max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
    public boolean bal(int[] freq){
        int x=0;
        for(int f:freq){
            if(f==0) continue;
            if(x==0) x=f;
            else if(x!=f) return false;
        }
        return true;
    }
}