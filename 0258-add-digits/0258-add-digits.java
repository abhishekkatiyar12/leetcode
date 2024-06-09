// class Solution {
//     public int addDigits(int num) {
//          int result=num;
        
//         while(result>9){
//            result=addInteger(result);
//         }
//         return result;
//     }
//     public int addInteger(int x){
//         int sum=0;
        
//         while(x>0){
//             sum+=x%10;
//             x /=10;
//         }
//         return sum;
//     }
// }




class Solution {
    public int addDigits(int num) {
        // If the number is less than 10, it is already a single-digit number
        if (num < 10) {
            return num;
        }
        
        // Calculate the sum of digits
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        // Recursively call addDigits on the sum until it becomes a single-digit number
        return addDigits(sum);
    }
}
