dfs(0, s, graph, letters, ans);
        return ans;
    }

    private int dfs(int node, String s, List<Integer>[] graph,
                    List<Integer>[] letters, int[] ans) {
        int c = s.charAt(node) - 'a';
        letters[c].add(node);
        }
            letters[i] = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
        List<Integer>[] letters = new ArrayList[26];


        for (int child : graph[node]) {
            int x = dfs(child, s, graph, letters, ans);
            ans[node] += x;
        }

        letters[c].remove(letters[c].size() - 1);

        if (!letters[c].isEmpty()) {
            int above = letters[c].get(letters[c].size() - 1);
            ans[above] += ans[node];
            return 0;
        } else {
            return ans[node];
        }
    }
}