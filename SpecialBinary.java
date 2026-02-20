class Solution {
    public String makeLargestSpecial(String s) {
        List<String> parts = new ArrayList<>();
        int balance = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') balance++;
            else balance--;

            // When balance becomes 0, we found a special substring
            if (balance == 0) {
                String inner = s.substring(start + 1, i);
                parts.add("1" + makeLargestSpecial(inner) + "0");
                start = i + 1;
            }
        }

        // Sort in descending order to get lexicographically largest string
        Collections.sort(parts, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}
