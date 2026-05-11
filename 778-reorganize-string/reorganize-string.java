class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;
        int letter = 0;

         for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                letter = i;
            }
        }

        if (maxFreq > (n + 1) / 2) {
            return "";
        }

        char[] result = new char[n];

        int index = 0;

        while (freq[letter] > 0) {
            result[index] = (char)(letter + 'a');
            index += 2;
            freq[letter]--;
        }

         for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {

                if (index >= n) {
                    index = 1;
                }

                result[index] = (char)(i + 'a');
                index += 2;
                freq[i]--;
            }
        }

        return new String(result);
    }
}