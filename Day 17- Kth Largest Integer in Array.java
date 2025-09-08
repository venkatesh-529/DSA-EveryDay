class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> {
            if (a.length() == b.length())
                return a.compareTo(b);
            else if (a.length() > b.length())
                return 1;
            return -1;
        });
        return nums[nums.length - k];
    }
}