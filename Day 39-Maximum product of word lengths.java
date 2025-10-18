class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        boolean[][] freq = new boolean[n][26]; 
        for (int i = 0; i < n; i++) {
            for (char ch : words[i].toCharArray()) {
                freq[i][ch - 'a'] = true;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (noCommon(freq[i], freq[j])) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }
    boolean noCommon(boolean[] a, boolean[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] && b[i]) return false; 
        }
        return true;
    }
}
