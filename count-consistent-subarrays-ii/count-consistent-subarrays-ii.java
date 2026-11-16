}
            }
        }

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            int L = leftOcc[i];
            int R = n + 1;

            for (int b = 0; b < BITS; b++) {
                if (((nums[i - 1] >> b) & 1) 
                    continue;
                }

                L = Math.max(L, left[i][b]);
                R = Math.min(R, right[i][b]);
            }
                    right[i][b] = right[i + 1]

            ans += (long) (R - i) * (i - L);
        }

                    [b];
                == 0) {
        return ans;
    }
}