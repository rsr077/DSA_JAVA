import java.util.Scanner;

public class MultiDimension {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int[][] arr = new int[3][2];

    System.out.println("Enter 3x2 = 6 elements:");

    // Input
    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; col++) {
         arr[row][col] = in.nextInt();
      }
    }

    // Output
    System.out.println("You entered:");
    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; col++) {
         System.out.print(arr[row][col] + " ");
      }
      System.out.println(); // next row
    }

    in.close();
  }
}
