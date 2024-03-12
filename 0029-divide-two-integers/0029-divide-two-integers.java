class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
           return Integer.MAX_VALUE;
            // System.out.println(Integer.MAX_VALUE);
//            return 2147483647;
        }else if (dividend/divisor> Integer.MAX_VALUE ) {
           return Integer.MAX_VALUE;
            // System.out.println(Integer.MAX_VALUE);
//            return 2147483647;
        }
            // System.out.println(dividend / divisor);
       return dividend/divisor;
        
    }



//        return result;
    }
//}