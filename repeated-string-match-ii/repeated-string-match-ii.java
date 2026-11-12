private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
    public boolean repeatedStringMatch(String a, String b, int x, int y) {
        int n = a.length(), m = b.length();
        long ta = 1L * n * x;
        long tb = 1L * m * y;
        
        if (tb > ta) return false;
        
        long temp = Math.min(tb, lcm(n, m));
        for (int i = 0; i < n; ++i) {
            if (i + tb > ta) break;
            
            boolean ok = true;
            for (int j = 0; j < temp; ++j) {
                if (b.charAt(j % m) != a.charAt((i + j) % n)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return true;
        }
        return false;
    }
}