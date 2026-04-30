class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while (i < n && Character.isWhitespace(s.charAt(i))) {
            i++;
        }

        int sign = 1;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        int curr = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (curr > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            curr = curr * 10 + digit;
            i++;
        }

        return sign * curr;
    }
}