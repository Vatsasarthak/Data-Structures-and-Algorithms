PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a
        pq.offer(new long[]{0L, -1L, 0L});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long t = cur[0];
            int u = (int) cur[1];
            int v = (int) cur[2];

            if (ans[v] != -1L) {
                continue;
            }
        [0]));
            if (u != -1) {
                seen[v].add(u);
            }
            if (v == 0 || seen[v].size() >= requiredSignals[v]) {
                ans[v] = t;
                for (long[] nxtEdge : adj[v]) {
                    int nxt = (int) nxtEdge[0];
                    long d = nxtEdge[1];
                    if (ans[nxt] == -1L) {
                        pq.offer(new long[]{t + d, v, nxt});
                    }
                }
            }
        }

        return ans;
    }
}