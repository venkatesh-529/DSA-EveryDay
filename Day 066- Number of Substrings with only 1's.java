class Solution {
    public int numSub(String s) {
        int n = s.length();
        long ans = 0;
        int i = 0;
        long m = 1000000007;
        while (i < n) {
            if (s.charAt(i) == '1'){
                int j = i;
                while (j < n && s.charAt(j) == '1')
                    j++;
                long len = j - i;
                ans = ( ans + (len * (len + 1)/ 2)%m)%m;
               // ans %= m;
                i = j;
            } else
                i++;
        }
        return (int)ans;
    }
}