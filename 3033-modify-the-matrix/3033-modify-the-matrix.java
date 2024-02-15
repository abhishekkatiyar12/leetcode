class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        
//         import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         int n,m;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the value of rows and colums:::---  ");
//         n=sc.nextInt();
//         m=sc.nextInt();
//         int[][] matrix= new int[n][m];


// //        enter the matrix
//         System.out.println("enter elements==--- ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }

//         System.out.println("printing the result==----");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++) {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//        making a copy of matrix in result

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

//        printing the elements of result
        System.out.println("printing the result==----");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(result[i][j]+" ");
             }
            System.out.println();
            }
        return result;
    }
    public static int columgeater(int n[][],int row ,int column){
        int larger=0;
        //for(int j=0;j<column;j++){
          //  larger=n[0][j];
            for(int i=0;i<row;i++){
                if(larger<n[i][column]){
                    larger=n[i][column];
                }
            }
        
        return larger;
    }
}
        
    