class Solution {
    public int[][] sortMatrix(int[][] m) {
        int n = m.length;
        for (int i = n - 1; i > 0; i--) {
            int si = 0;
            int sj = i;
            List<Integer> l = new ArrayList<>();
            while (sj < n) {
                l.add(m[si][sj]);
                si++;
                sj++;
            }
            Collections.sort(l);
            si = 0;
            sj = i;
            while (sj < n) {
                m[si][sj] = l.get(si);
                si++;
                sj++;
            }
        }
        for (int c = 0; c < n; c++) {
            int si = c;
            int sj = 0;
            List<Integer> l = new ArrayList<>();
            while (si < n) {
                l.add(m[si][sj]);
                si++;
                sj++;
            }
            Collections.sort(l, Collections.reverseOrder());
            si = c;
            sj = 0;
            while (si < n) {
                m[si][sj] = l.get(sj);
                si++;
                sj++;
            }
        }
        return m;
    }
}