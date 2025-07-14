package Binary_Search.Binary_Interview;

public class Floor {
 

    // Function to find floor of x
    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1; // default if no floor exists

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; // exact match is the floor
            } else if (arr[mid] < x) {
                floor = arr[mid]; // possible floor, look on the right
                low = mid + 1;
            } else {
                high = mid - 1; // look on the left
            }
        }

        return floor;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12, 14};
        int x = 5;

        int result = findFloor(arr, x);
        if (result != -1)
            System.out.println("Floor of " + x + " is: " + result);
        else
            System.out.println("No floor found for " + x);
    }
}


