class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        boolean e=true;
        boolean o=true;
        for(int ele:nums1) {
            if(ele%2==0) o=false;
            else e=false;
            
            min=Math.min(ele,min);
        }
        if(o||e) return true;
        return min%2==1;
    }
}