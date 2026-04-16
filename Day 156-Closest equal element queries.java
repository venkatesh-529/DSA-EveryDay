class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int a[] = new int[n];
        Arrays.fill(a, -1);
        for (List<Integer> list : map.values()) {
            int size = list.size();
            if (size == 1) {
                continue;
            }
            for (int i = 0; i < size; i++) {
                int curr = list.get(i);

                int prev = list.get((i - 1 + size) % size);
                int next = list.get((i + 1) % size);

                int d1 = distance(curr, prev, n);
                int d2 = distance(curr, next, n);

                a[curr] = Math.min(d1, d2);
            }
        }
        List<Integer> l = new ArrayList<>();
        for (int ele : queries)
            l.add(a[ele]);
        return l;
    }

    private int distance(int a, int b, int n) {
        int diff = Math.abs(a - b);
        return Math.min(diff, n - diff);
    }
}