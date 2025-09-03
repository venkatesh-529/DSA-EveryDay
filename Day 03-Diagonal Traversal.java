class Solution {
    public int[] findDiagonalOrder(int[][] ma) {
        int n = ma.length;
        int m = ma[0].length;
        List<Integer>[] l = new ArrayList[n + m - 1];
        for (int i = 0; i < n + m - 1; i++) {
            l[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                l[i + j].add(ma[i][j]);
            }
        }
        int ans[] = new int[n * m];
        int k = 0;
        for (int d = 0; d < n + m - 1; d++) {
            if (d % 2 == 0) {
                for (int i = l[d].size() - 1; i >= 0; i--)
                    ans[k++] = l[d].get(i);
            } else {
                for (int i = 0; i < l[d].size(); i++)
                    ans[k++] = l[d].get(i);
            }
        }
        return ans;
    }
}