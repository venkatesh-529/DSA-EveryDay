class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0, z = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            while (z > 1) {
                if (nums[j] == 0) {
                    z -= 1;
                }
                j++;
            }
            max = Math.max(max, i - j);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}