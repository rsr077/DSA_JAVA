public class Binary {


    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Repeat until low and high cross
        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.println("Checking middle index " + mid + ", value: " + arr[mid]);

            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14}; // Sorted array
        int target = 10; // Number to find

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("🎯 Found " + target + " at index " + result);
        } else {
            System.out.println("❌ " + target + " not found in the array.");
        }
    }
}


