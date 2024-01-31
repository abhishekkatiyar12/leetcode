class Solution {
    public boolean squareIsWhite(String coordinates) {
         char letter = coordinates.charAt(0);
        char number = coordinates.charAt(1);

        // Calculate the sum of ASCII values of letter and number
        int sum = (int) letter + (int) number;
           
        // Check the parity of the sum
        return sum % 2 != 0;
    
    }
}