class Solution {
    public int finalValueAfterOperations(String[] operations) {
    int X = 0;

        for (String op : operations) {
            switch (op) {
                case "++X":
                case "X++":
                    X++;
                    break;
                case "--X":
                case "X--":
                    X--;
                    break;
                default:
                    System.out.println("Invalid operation: " + op);
                    break;
            }
        }

        return X;
    }
}