class Solution {
    public int maxDistinct(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()) m.put(ch,m.getOrDefault(ch,0)+1);
        return m.size();
    }
}