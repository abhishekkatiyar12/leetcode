/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid to avoid integer overflow
            int result = guess(mid);

            if (result == 0) {
                return mid; // Found the correct number
            } else if (result == -1) {
                high = mid - 1; // Number is higher, search in the lower half
            } else {
                low = mid + 1; // Number is lower, search in the upper half
            }
        }

        return -1; // If no number is found (should not happen based on problem statement)
    }
}
