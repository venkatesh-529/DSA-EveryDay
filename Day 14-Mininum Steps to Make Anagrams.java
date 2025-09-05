class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)-1);
            
        }
        System.out.println(m);
        int sum=0;
        for(int ele:m.values())sum+=Math.abs(ele);
        return sum/2;
        
    }
}