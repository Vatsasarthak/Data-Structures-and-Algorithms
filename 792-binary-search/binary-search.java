class Solution {
    public int search(int[] nums, int target) {
         return dhd(nums, 0, nums.length - 1, target);
    }
        int dhd(int[] nums,int low,int high,int target){
            if(low>high){
                return -1;
            }
            int mid=low + (high-low)/2;
            if(nums[mid]==target){
                return mid ;
            }
            else if(nums[mid]<target){
                 return dhd(nums,mid+1,high,target);
            }
            else{
                 return dhd(nums,low,mid-1,target);
            }
        }
        
    }