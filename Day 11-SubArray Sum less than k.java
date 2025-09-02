class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long prod = 1;
        int j = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= k && j <= i) {
                prod = prod / nums[j];
                j++;
            }
            c += (i - j + 1);
        }
        return c;
    }
}