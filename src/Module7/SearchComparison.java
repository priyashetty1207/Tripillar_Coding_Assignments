package Module7;

import java.util.Arrays;

public class SearchComparison {

    // Linear Search Method
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 70;

        // Linear Search
        long startLinear = System.nanoTime();
        int linearResult = linearSearch(arr, key);
        long endLinear = System.nanoTime();

        // Binary Search
        long startBinary = System.nanoTime();
        int binaryResult = binarySearch(arr, key);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Index: " + linearResult);
        System.out.println("Binary Search Index: " + binaryResult);

        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
    }
}