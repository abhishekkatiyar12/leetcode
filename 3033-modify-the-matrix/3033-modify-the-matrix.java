class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
         int n=matrix.length;
        int m=matrix[0].length;
        int[][] result= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=matrix[i][j];
            }
        }
//        checking for -1

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(result[i][j]==-1){
                  result[i][j]= columgeater(result,n,j);
              }
            }
        }

        return result;
    }
    public static int columgeater(int n[][],int row ,int column){
        int larger=0;
       
            for(int i=0;i<row;i++){
                if(larger<n[i][column]){
                    larger=n[i][column];
                }
            }
        
        return larger;
    }
}
        
    