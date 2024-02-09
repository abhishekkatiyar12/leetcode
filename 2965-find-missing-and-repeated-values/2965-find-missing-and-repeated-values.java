class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int[] result=new int[2];
        ArrayList<Integer> list = new ArrayList<>();
     
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(list.contains(grid[i][j])){
                    result[0]=grid[i][j];
                }
                list.add(i, grid[i][j]);
            }
        }
        for(int i=0;i<=Math.pow(grid.length, 2)-1;i++){
            if(!(list.contains(i+1))){
                result[1]=(i+1);
            }
        }
        return result;
      }
}