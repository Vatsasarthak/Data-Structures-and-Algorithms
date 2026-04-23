class Solution {
    static char nonRepeatingChar(String s) {
        int[] freq = new int[26];

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Find first non-repeating
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }

        // Step 3: If none found
        return '$';
    }
}