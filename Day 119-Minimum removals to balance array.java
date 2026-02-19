class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=0, maxLength = 0;

        while(j < nums.length) {
            if(1.0*nums[j]/nums[i] <= k) {
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            } else {
                i++;
            }
        }

        return nums.length - maxLength;
    }

}