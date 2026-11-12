class Solution {
    public long countValidSubstrings(String s) {
        long sol = 0;
        int n = s.length();
        int i = 0;
        int j = 0;
        while(j<n)
        {
            if(j>=2 && s.charAt(j-2) == 'a'&& s.charAt(j-1) == 'b' && s.charAt(j) == 
            'c' )
            i = j-1;
            sol+= j-i+1;
            j++;
        }
        return sol;
    }
}