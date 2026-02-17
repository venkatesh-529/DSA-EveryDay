class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer,Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        Map<Integer,Integer> countFreq = new HashMap<>();
        for (int f : freq.values()) {
            countFreq.put(f, countFreq.getOrDefault(f, 0) + 1);
        }
        for (int n : nums) {
            if (countFreq.get(freq.get(n)) == 1)
                return n;
        }

        return -1;
    }
}
 