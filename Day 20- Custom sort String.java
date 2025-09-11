class Solution {
    public String customSortString(String order, String s) {
        List<Character> l=new ArrayList<>();
        for(char ch:s.toCharArray()){
            l.add(ch);
        }
        l.sort((x,y)->{
            int a=order.indexOf(x);
            int b=order.indexOf(y);
            return a-b;
        });
        StringBuffer sb=new StringBuffer();
        for(char ch:l){
            sb.append(ch);
        }
        return sb.toString();
    }
}