class Solution {
    public int minOperations(String s) {
        String temp=s;
        int min=Integer.MIN_VALUE;
        for(char ch:temp.toCharArray()){
            int step=('a'-ch+26)%26;
            min=Math.max(min,step);
        }
        return min;
    }
}