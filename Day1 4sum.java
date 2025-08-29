class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < a.length-3; i++) {
            if (i > 0 && a[i] == a[i - 1])
                continue;
            for (int j = i+1; j < a.length-2; j++) {
                if (j > i + 1 && a[j] == a[j - 1])
                    continue;
                int left = j + 1;
                int right = a.length - 1;
                while (left < right) {
                    long sum = (long)a[i]+(long)a[j]+(long)a[left] + (long)a[right];
                    if (sum ==(long) t) {
                        ans.add(Arrays.asList(a[i], a[j], a[left], a[right]));
                        
                        while (left < right && a[left] == a[left+1])left++;
                        
                        while (left < right && a[right] == a[right-1])right--;

                        left++;
                        right--;
                    } else if (sum < (long)t) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}