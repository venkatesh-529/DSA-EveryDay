class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int ele:nums){
            String s=String.valueOf(ele);
            for(int i=0;i<s.length();i++)if(s.charAt(i)-'0'==digit) c++;
        }
        return c;
    }
}