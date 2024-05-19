class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List <List<Integer>>triangle =new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            // Create a new list to hold the current row
            List<Integer> row = new ArrayList<>();
            
            // The first and last element of each row is always 1
            row.add(1);
            
            // Fill the in-between elements of the row
            for (int j = 1; j < i; j++) {
                // Each element is the sum of the two elements directly above it
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            
            // If the current row index is greater than 0, add the last 1
            if (i > 0) {
                row.add(1);
            }
            
            // Add the current row to the triangle
            triangle.add(row);
        }
        return triangle;
    }
}