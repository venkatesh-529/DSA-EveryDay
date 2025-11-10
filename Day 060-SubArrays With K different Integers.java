class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }

    public int helper(int a[], int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int atmostk = 0 , j = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
            while (m.size() > k) {
                m.put(a[j], m.get(a[j]) - 1);
                if (m.get(a[j]) == 0)
                    m.remove(a[j]);
                j++;
            }
            atmostk += i - j + 1;
        }
        return atmostk;
    }
}