class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int start=0;
        int end=n*m-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int midELT=matrix[mid/m][mid%m];
            if(midELT==target){
                return true;
            }
            else if(target<midELT){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;


        
    }
}