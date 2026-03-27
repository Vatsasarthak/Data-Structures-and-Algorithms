class Solution {
    public int maxDepth(String s) {
        int current = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                current++;
                depth = Math.max(depth, current);
            } else if (c == ')') {
                current--;
            }
        }
        return depth;
    }
}