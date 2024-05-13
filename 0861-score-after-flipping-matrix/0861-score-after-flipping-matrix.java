class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        // int totalScore=0;
        
        // calculate the total score of original grid
//         for(int i=0;i<m;i++){
//             String binary="";
//             for(int j=0;j<n;j++){
//                 binary +=grid[i][j];
//             }
//             int decimal = Integer.parseInt(binary, 2);
//             totalScore+=decimal;
//         }
        
        // count the number of zeros in each column if there are less than the 0's then flip them
       
        for(int i=0;i<n;i++){
            int countzeros=0,countone=0;
            for(int j=0;j<m;j++){
             if(grid[j][i]==0){
                 countzeros++;
             }else{
                 countone++;
             }
            }
            if(countone<countzeros){
                for(int j=0;j<m;j++){
                   if(grid[j][i]==0){
                       grid[j][i]=1;
                   }else{
                       grid[j][i]=0;
                   }
                }
            }
            
           // checking for row's if they are starting from 0 filp the entire row--------
                for(int j=0;j<m;j++){
                    if(grid[j][0]==0){
                        for(int a=0;a<n;a++){
                            if(grid[j][a]==0){
                       grid[j][a]=1;
                   }else{
                       grid[j][a]=0;
                   }
                        }
                    }
               
            }
            
        }
        
       
        
        // calculating the new score 
        
        int new_total=0;
         for(int i=0;i<m;i++){
            String binary="";
            for(int j=0;j<n;j++){
                binary +=grid[i][j];
            }
            int decimal = Integer.parseInt(binary, 2);
            new_total+=decimal;
        }
        
       
        return new_total;
        
    }
}