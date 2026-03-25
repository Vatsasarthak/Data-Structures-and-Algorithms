class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length< m * k){
            return -1;
        }
        return minimumdays(bloomDay, m , k );
    }
    int minimumdays(int[] bloomDay, int m ,int k ){
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        int ans=-1;
        while(low <= high){
        int mid=low + (high - low)/2;
        int flower = bloom(bloomDay, mid , k);
        if(flower >= m){
            ans = mid;
            high = mid -1;
        }
        else {
            low = mid + 1 ;
        }
        }
         return ans;
    }
    int bloom(int[] bloomDay, int mid , int k){
        int count=0;
        int bloom=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                count++;
            }
            else {
                bloom += (count / k);
                count =0;
            }
        }
        return bloom +=(count /k );
    }
}