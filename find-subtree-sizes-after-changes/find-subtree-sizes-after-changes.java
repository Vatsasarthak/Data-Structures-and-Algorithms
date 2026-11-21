stack.push(child);
            } else {
                x = ~x;
                last[s.charAt(x) - 'a'] = above[x];
                if (x > 0)  // the root has no parent
                    size[above[x] >= 0 ? above[x] : parent[x]] += size[x];
            }
        }
        return size;
                for (int child : children.get(x))
                stack.push(~x);  // leave x after all its children
                last[c] = x;
                above[x] = last[c];  // the closest ancestor with the same letter, or 
                int c = s.charAt(x) - 'a';
            if (x >= 0) {
            int x = stack.pop();
        while (!stack.isEmpty()) {
        Deque<Integer> stack = new ArrayDeque<>(List.of(0));  // x enters x, ~x leaves 
        Arrays.fill(last, -1);
        Arrays.fill(size, 1);
        int[] size = new int[n], above = new int[n], last = new int[26];  // last[c]: 
            children.get(parent[x]).add(x);
        for (int x = 1; x < n; x++)
            children.add(new ArrayList<>());
        for (int x = 0; x < n; x++)
        List<List<Integer>> children = new ArrayList<>();
        the deepest node with letter c on the path from the root
        it: no recursion, so no stack overflow on a deep tree
                -1
        int n = parent.length;
    public int[] findSubtreeSizes(int[] parent, String s) {
class Solution {