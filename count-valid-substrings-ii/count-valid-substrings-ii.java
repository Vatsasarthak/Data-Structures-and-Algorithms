int n = s.length();
        int[] na = new int[n + 1];
        int[] nb = new int[n + 1];
        int[] nc = new int[n + 1];
        na[n] = n;
        nb[n] = n;
        nc[n] = n;

        for(int i = n - 1; i >= 0; i--) {
            na[i] = s.charAt(i) == 'a' ? i : na[i + 1];
            nb[i] = s.charAt(i) == 'b' ? i : nb[i + 1];
            nc[i] = s.charAt(i) == 'c' ? i : nc[i + 1];
        }

        long total = (long)n * (n + 1) / 2;
        long invalid = 0;

        // all with a .. b.. c x x x will be invalid
        // so for each start index we can find the next a, then next b and next c
        for(int i = 0; i < n; i++) {
            int a = na[i];
            if(a == n) continue;
            int b = nb[a + 1];
            if(b == n) continue;
            int c = nc[b + 1];
            if(c == n) continue;
            invalid += n - c;
        }
        return total - invalid;
        // for each a, we need next b and then for each b we need next c
    public long countValidSubstrings(String s) {
class Solution {