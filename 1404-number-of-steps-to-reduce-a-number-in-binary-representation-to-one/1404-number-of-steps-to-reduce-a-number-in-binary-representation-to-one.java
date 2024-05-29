import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger integerValue =new BigInteger(s, 2);
        int count=0;
       BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");

        while (integerValue.compareTo(one) > 0) {
            if (integerValue.mod(two).equals(one)) {
                integerValue = integerValue.add(one);
                count++;
            } if (!(integerValue.mod(two).equals(one))) {
                integerValue = integerValue.divide(two);
            
            count++;
            }
        }
        return count;
    }
}