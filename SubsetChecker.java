import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Create a set to store elements of the first array
        Set<Integer> set = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Check if all elements of the second array are present in the set
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5};

        boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}
