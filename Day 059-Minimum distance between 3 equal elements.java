class Solution {
    public int minimumDistance(int[] a) {
        HashMap<Integer, List<Integer>> m = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(a[i]))
                m.get(a[i]).add(i);
            else {
                m.put(a[i], new ArrayList<>());
                m.get(a[i]).add(i);
            }
        }
        System.out.print(m);
        int min = Integer.MAX_VALUE;
        for (int x : m.keySet()) {
            List<Integer> l = m.get(x);
            if (l.size() >= 3) {
                for (int i = 0; i + 2 < l.size(); i++) {
                    int left = l.get(i);
                    int right = l.get(i + 2);
                    min = Math.min(min, 2 * (right - left));
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}