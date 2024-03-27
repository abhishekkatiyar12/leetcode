class Solution {
    public String intToRoman(int num) {
             Map<Integer, String> romanSymbols = new LinkedHashMap<>();
        romanSymbols.put(1000, "M");
        romanSymbols.put(900, "CM");
        romanSymbols.put(500, "D");
        romanSymbols.put(400, "CD");
        romanSymbols.put(100, "C");
        romanSymbols.put(90, "XC");
        romanSymbols.put(50, "L");
        romanSymbols.put(40, "XL");
        romanSymbols.put(10, "X");
        romanSymbols.put(9, "IX");
        romanSymbols.put(5, "V");
        romanSymbols.put(4, "IV");
        romanSymbols.put(1, "I");

        StringBuilder romanNumeral = new StringBuilder();
        
        // Iterate through the values in descending order
        for (Map.Entry<Integer, String> entry : romanSymbols.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            
            // While the integer is greater than or equal to the current value
            while (num >= value) {
                // Append the corresponding symbol to the Roman numeral representation
                romanNumeral.append(symbol);
                // Subtract the value from the integer
                num -= value;
            }
        }
        
        return romanNumeral.toString();
    }
}