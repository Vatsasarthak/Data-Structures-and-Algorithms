class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        Deque<Integer> dq = new ArrayDeque<>();
        int n= nums.length;
        for(int i = 0 ; i < n ; i++ ){
            while(!dq.isEmpty() && nums[dq.peekLast()] >= nums[i] ){
                dq.pollLast();
            }
            dq.addLast(i);
            // System.out.println(dq.peekFirst());
        }
        // System.out.println(dq.size());
        int max = nums[0];
        for(int i = 0  ; i < n ; i++){
            max = Math.max(max , nums[i]);
            // System.out.println("Max =" + max);
            while(!dq.isEmpty() && dq.peekFirst() < i ){
                dq.pollFirst();
            }
            // System.out.println("Min =" +nums[dq.peekLast()]);
            if(!dq.isEmpty()){
                int min = nums[dq.peekFirst()];
                int st = max - min;
                System.out.println("St =" + st);
                if(st <= k){
                    return i;
                }
            }
            
        }
        return -1;
    }
}