class Solution {
    public int myAtoi(String s) {
        int idx = 0, n = s.length();
        int sign = 1;
        long res = 0;
// solve one more time you are confused 
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }

        if (idx < n && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            if (s.charAt(idx) == '-') {
                sign = -1;
            }
            idx++;
        }

        while (idx < n && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';
            res = res * 10 + digit;

            if (sign * res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            idx++;
        }

        return (int) (sign * res);
    }
}