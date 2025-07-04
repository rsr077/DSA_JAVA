import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
     int [] arr =  new int[5]; 

   /*   arr[0] = 23;
     arr[1] = 4534;
     arr[2] = 54; */
/*   */

/* System.out.println(arr[1]); */

 for(int i = 0; i< arr.length; i++)  {
   arr[i] = in.nextInt();
 }

 for(int i = 0; i< arr.length; i++)  {
   arr[i] = in.nextInt();
 }

    for(int i = 0; i< arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  
}
