class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        String prev = new String();
        List<List<String>> l = new ArrayList<>();
        int s = 0, left = 0;
        for (char ch : searchWord.toCharArray()) {
            prev += ch;
            int sindex = bsearch(products, left, prev);
            List<String> ans = new ArrayList<>();
            for (int i = sindex; i < Math.min(products.length, sindex + 3); i++) {
                if (products[i].length() < prev.length() || !products[i].substring(0, prev.length()).equals(prev))
                    break;
                ans.add(products[i]);
            }
            l.add(ans);
            left = sindex;
        }
        return l;
    }

    public int bsearch(String[] x, int start, String tar) {
        int i = start, j = x.length;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (x[m].compareTo(tar) >= 0)
                j = m;
            else
                i = m + 1;
        }
        return i;
    }
}