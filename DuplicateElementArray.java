import java.util.HashMap;
import java.util.Map;

public class DuplicateElementArray {
    public static void findDuplicates(int[] arr) {
        // Create a map to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate over the array
        for (int num : arr) {
            // If the element is already present in the map, increment its count
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                // Otherwise, add the element to the map with count as 1
                countMap.put(num, 1);
            }
        }

        // Iterate over the map entries
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            // If the count is greater than 1, the element is a duplicate
            if (count > 1) {
                System.out.println("Duplicate element: " + num + ", Count: " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 4, 6, 1};
        findDuplicates(arr);
    }
}
