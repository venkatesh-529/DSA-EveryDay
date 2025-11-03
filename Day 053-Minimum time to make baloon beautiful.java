class Solution {
    public int minCost(String c, int[] t) {
        int n = c.length();
        int i = 0;
        int min = 0;
        while (i < n - 1) {
            if (c.charAt(i) == c.charAt(i + 1)) {
                int sum = t[i];
                int max = t[i];
                while (i < n - 1 && c.charAt(i) == c.charAt(i + 1)) {
                    sum += t[i + 1];
                    max = Math.max(max, t[i + 1]);
                    i++;
                }
                min += sum - max;
            }
            i++;
        }
        return min;
    }
}