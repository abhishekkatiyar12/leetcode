// approach
// to fill the element in the answer matrix we have to find the 3*3 grid from original grid which is starting from the same row and same column 



class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        
        // declaring the answer array
        int [][] answer= new int[m-2][m-2];
      
        // filing the values in the answer array 
        for(int i=0;i<m-2;i++){
 
        for(int j=0;j<m-2;j++){
            answer[i][j]=findGreatest(grid,i,j);
        }
            }
        
        // return array(answer)
        return answer;
    }
    
    
    // helper method to find the greatest among the 3*3 matrix
    
    public static int findGreatest(int[][] arr,int a,int b){
        int max=Integer.MIN_VALUE;
        // int i=a;
        // int j=b;
        
          for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }
}