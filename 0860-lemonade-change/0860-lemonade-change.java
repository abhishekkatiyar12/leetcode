

class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);   // Initialize count of 5-dollar bills
        map.put(10, 0);  // Initialize count of 10-dollar bills

        for (int bill : bills) {
            if (bill == 5) {
                map.put(5, map.get(5) + 1); // Receive a 5-dollar bill
            } else if (bill == 10) {
                if (map.get(5) > 0) {
                    map.put(5, map.get(5) - 1); // Give 5-dollar bill as change
                    map.put(10, map.get(10) + 1); // Receive a 10-dollar bill
                } else {
                    return false; // Not enough 5-dollar bills for change
                }
            } else if (bill == 20) {
                if( (map.get(10) > 0) &&(map.get(5)>0)){
                    map.put(10, map.get(10) - 1); // Give 10-dollar bill as change
                    map.put(5, map.get(5) - 1);
                   
                } else if (map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3); // Give three 5-dollar bills as change
                } else {
                    return false; // Not enough change available
                }
            }
        }
        return true; // Successfully provided change for all customers
    }
}
