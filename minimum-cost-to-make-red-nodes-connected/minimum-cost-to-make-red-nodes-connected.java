int u = order[i];
            subtreeSize[u] = 1;
            long childContribution = 0;

            for (int j = head[u]; j != -1; j = next[j]) {
                int v = to[j];

                if (parent[v] != u) {
                    continue;
                }

                subtreeSize[u] += subtreeSize[v];
                childContribution += Math.max(0L, dp[v]);
            }

            long weight;

            if (colors.charAt(u) == 'R') {
                weight = subtreeSize[u];
                baseline += subtreeSize[u];
            } else {
                weight = -subtreeSize[u];
            }

            dp[u] = weight + childContribution;
            maxSaving = Math.max(maxSaving, dp[u]);
        }

        return baseline - maxSaving;
    }
}