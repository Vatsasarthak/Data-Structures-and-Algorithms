int[] best = new int[n + 1];  // best[j]: the fewest changes for s[:j] cut 
        into the pieces placed so far
        Arrays.fill(best, inf);
        best[0] = 0;
        for (int pieces = 1; pieces < k; pieces++) {  // every piece but the last
            int[] next = new int[n + 1];
            Arrays.fill(next, inf);
            for (int j = 2 * pieces; j <= n - 2 * (k - pieces); j++)  // 2 letters for 
            each piece, placed or still to come
                next[j] = extend(best, cost, j);
            best = next;
        }
        return extend(best, cost, n);  // the last piece ends at n
    }

    private int peel(String s, int i, int j, int d) {  // s[i:j] in blocks of d: the 
    outer pair of blocks, then the inside
        int changes = 0;
        for (; j - i > d; i += d, j -= d)

                for (int i = 0, j = length; j <= n; i++, j++)
                    cost[i][j] = Math.min(cost[i][j], peel(s, i, j, d));
            for (int length = 2 * d; length <= n; length += d)  // every length that d 
            divides, with d < length
            Arrays.fill(row, inf);
        for (int d = 1; 2 * d <= n; d++)
        for (int[] row : cost)
        int[][] cost = new int[n + 1][n + 1];  // cost[i][j]: changes to make s[i:j] a 
        semi-palindrome
        int n = s.length(), inf = Integer.MAX_VALUE / 2;
    public int minimumChanges(String s, int k) {
class Solution {