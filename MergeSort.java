public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle index
            int mid = (left + right) / 2;

            // Sort the left subarray
            mergeSort(arr, left, mid);

            // Sort the right subarray
            mergeSort(arr, mid + 1, right);

            // Merge the sorted subarrays
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int size1 = mid - left + 1;
        int size2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        // Copy data to the temporary arrays
        for (int i = 0; i < size1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < size2; ++j) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < size1 && j < size2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[]
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[]
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 1, 4, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
