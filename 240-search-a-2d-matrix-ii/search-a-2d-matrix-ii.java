class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length ; i++){
            if(matrix[i][0] <= target && target <=matrix[i][matrix[i].length -1]){
            if(search(matrix[i] , target)){
                return true;
            }
        }
        }
        return false;
    }

    boolean search(int[] row , int target){
        int low=0;
        int high=row.length -1;
        while(low <= high){
            int mid = low +(high -low)/2;
            if(row[mid]==target){
                return true;
            }
            else if (row[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}