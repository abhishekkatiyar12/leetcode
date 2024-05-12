class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] answer= new int[m-2][n-2];
      
        
        for(int i=0;i<m-2;i++){
 
        for(int j=0;j<n-2;j++){
            answer[i][j]=findGreatest(grid,i,j);
        }
            }
        
        return answer;
    }
    
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