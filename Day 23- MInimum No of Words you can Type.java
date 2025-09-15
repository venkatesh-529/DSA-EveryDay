class Solution {
    public int canBeTypedWords(String text, String b) {
        String str[]=text.split(" ");
        List<Character> l=new ArrayList<>();
        for (char c : b.toCharArray()) {
            l.add(c);
        }
        int c=0;
        for(String s:str){
            Set<Character> se=new HashSet<>();
            for (char ch : s.toCharArray()) {
                se.add(ch);
            }
            boolean flag=false;
            for(char ch:se){
                if(l.contains(ch)){
                    flag=true;
                    break;
                }
            }
            if(!flag) c+=1;
        }
        return c;
    }
}