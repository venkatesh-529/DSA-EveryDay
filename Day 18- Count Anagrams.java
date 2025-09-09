class Solution {
    static int m = 1000000007;

    public int countAnagrams(String s) {
        long ans = 1;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            long x = fact(str[i].length());
            int[] freq = new int[26];
            for (char ch : str[i].toCharArray()) {
                freq[ch - 'a']++;
            }
            long den = 1;
            for (int f : freq) {
                if (f > 1)
                    den = (den * fact(f)) % m;
            }
            long res = (x * modInverse(den)) % m;
            ans = ((ans % m) * (res % m)) % m;
        }
        return (int) ans;
    }

    public long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++)
            f = (f * i) % m;
        return f;
    }

    private long modInverse(long a) {
        return modPow(a, m - 2);
    }

    private long modPow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % m;
            base = (base * base) % m;
            exp >>= 1;
        }
        return result;
    }
}