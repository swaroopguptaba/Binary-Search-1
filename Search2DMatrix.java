public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m*n-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}
