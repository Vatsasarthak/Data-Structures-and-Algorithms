class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr1) {
            while (val > 0) {
                set.add(val);
                val = val / 10;
            }
        }

        int ans = 0;

        for (int val : arr2) {
            int len = String.valueOf(val).length();

            while (val > 0) {
                if (set.contains(val)) {
                    ans = Math.max(ans, len);
                    break;
                }

                val = val / 10;
                len--;
            }
        }

        return ans;
    }
}