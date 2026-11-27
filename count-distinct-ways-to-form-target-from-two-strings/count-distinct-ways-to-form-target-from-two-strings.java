long[] pref1 = new long[n + 1];
                    pref0[0] = dp[0][prevb][0][t];
                    pref1[0] = dp[0][prevb][1][t];
                    for (int preva = 1; preva <= n; preva++) {
                        pref0[preva] = (pref0[preva - 1] + dp[preva][prevb][0][t]) % MOD;
                        pref1[preva] = (pref1[preva - 1] + dp[preva][prevb][1][t]) % MOD;
                    }
                    for (int preva = 1; preva <= n; preva++) {
                        if (a.charAt(preva - 1) != x) continue;
                        dpnxt[preva][prevb][1][t] =
                            (dpnxt[preva][prevb][1][t] + pref0[preva - 1] + pref1[preva - 1]) % MOD;
                    }
                }
            }

            for (int preva = 0; preva <= n; preva++) {
                for (int k = 0; k < 2; k++) {
                    long[] pref0 = new long[n2 + 1];
                    long[] pref1 = new long[n2 + 1];
                    pref0[0] = dp[preva][0][k][0];
                    pref1[0] = dp[preva][0][k][1];
                    for (int prevb = 1; prevb <= n2; prevb++) {
                        pref0[prevb] = (pref0[prevb - 1] + dp[preva][prevb][k][0]) % MOD;
                        pref1[prevb] = (pref1[prevb - 1] + dp[preva][prevb][k][1]) % MOD;
                    }
                    for (int prevb = 1; prevb <= n2; prevb++) {
                        if (b.charAt(prevb - 1) != x) continue;
                        dpnxt[preva][prevb][k][1] =
                            (dpnxt[preva][prevb][k][1] + pref0[prevb - 1] + pref1[prevb - 1]) % MOD;
                    }
                }
            }

            long[][][][] tmp = dp; dp = dpnxt; dpnxt = tmp;
        }

        long ans = 0;
        for (int preva = 0; preva <= n; preva++)
            for (int prevb = 0; prevb <= n2; prevb++)
                ans = (ans + dp[preva][prevb][1][1]) % MOD;
        return (int) ans;
    }
}