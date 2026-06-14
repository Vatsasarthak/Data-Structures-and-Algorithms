class Solution {
    public boolean checkGoodInteger(int n) {
        long sm=0;
        long sqsum=0;
        while(n!=0){
            int rem=n%10;
            sm+=rem;
            sqsum+=(rem*rem);
            n/=10;
        }
        return sqsum-sm>=50;
    }
}