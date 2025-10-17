class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        HashMap<Character,Integer> m=new HashMap<>();
        int i=0,j=0;
        while(i<n2){
            char c=s2.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
            while(i-j+1>n1){
                char ch=s2.charAt(j);
                m.put(ch,m.get(ch)-1);
                if(m.get(ch)==0)m.remove(ch);
                j++;
            }
            if(check(s1,m))return true;
            i++;
        }
        return false;
    }
    boolean check(String s,Map<Character,Integer> m){
        int f[]=new int[26];
        for(char ch:s.toCharArray())f[ch-'a']++;
        for(char ch:m.keySet()){
            int x=m.get(ch);
            f[ch-'a']-=x;
        }
        for(int x:f) if(x!=0) return false;
        return true;
    }
}