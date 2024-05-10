import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        TreeMap<Double, String> tree = new TreeMap<>();

        // Populate the TreeMap with fractions and their string representations
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String fractionStr = arr[i] + "/" + arr[j]; // Create string representation
                double fractionValue = (double) arr[i] / arr[j]; // Calculate fraction value
                tree.put(fractionValue, fractionStr); // Store fraction value as key and string as value
            }
        }
        int count=0;

        // Retrieve the k-th smallest fraction from the TreeMap
        String kthFractionStr = "";
        for (Map.Entry<Double, String> entry : tree.entrySet()) {
            count++;
            if (count==k) {
                kthFractionStr = entry.getValue();
                break;
            }
        }

        // Split the k-th fraction string to extract numerator and denominator
        String[] parts = kthFractionStr.split("/");
        int numerator = Integer.parseInt(parts[0]);
        int denominator = Integer.parseInt(parts[1]);

        // Return the numerator and denominator as the result array
        return new int[]{numerator, denominator};
    }
}
