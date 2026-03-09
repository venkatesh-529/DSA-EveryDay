class Solution {
    public int smallestBalancedIndex(int[] nums) {
         int n = nums.length;
        long[] rightProd = new long[n];
        rightProd[n - 1] = 1;
        int m=1000000007;
        for (int i = n - 2; i >= 0; i--) {
            rightProd[i] = (rightProd[i + 1] * nums[i+1])%m;
        }
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            long right = rightProd[i];

            if (leftSum == right) {
                return i;
            }
            leftSum = (leftSum+nums[i])%m;
        }
        return -1;
    }
}