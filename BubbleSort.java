public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Perform n-1 passes
        for (int i = 0; i < n - 1; i++) {
            // Each pass compares adjacent elements and swaps if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 1, 4, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

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
