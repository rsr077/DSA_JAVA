public class Star {

    public static void main(String[] args) {
        int n = 3; // middle line has 5 stars (2*n-1)

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print("  ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}


