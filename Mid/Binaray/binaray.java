package Mid.Binaray;

public class binaray {

    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid; // Found, return index
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 15}; // Must be sorted
        int target = 7;

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}


