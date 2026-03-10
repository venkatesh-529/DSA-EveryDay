class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuffer x=new StringBuffer();
        int n=nums.length;
        for(int i=0;i<n;i++){
            x.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return x.toString();
    }
}