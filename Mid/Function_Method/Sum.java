/* 
import java.util.Scanner;

public class Sum {
  public  static void main (String[]  args) {

  sum();

}

 static void sum() {
   Scanner in = new Scanner(System.in);

   System.out.print(" Emter numberOne");

   int  num1 = in.nextInt();

   System.out.print(" Enter numberTwo");
   
   int num2  = in.nextInt();

   int  sum = num1 + num2;

   System.out.println("Your are answer is"  + " " + sum);

  }

 }

 */


//  return the  value 



import java.util.Scanner;

public class Sum {
  public  static void main (String[]  args) {

      int ans = sum2();
      System.out.println(ans); 

}

 static void sum2() {
   Scanner in = new Scanner(System.in);

   System.out.print(" Emter numberOne");
   int  num1 = in.nextInt();
   System.out.print(" Enter numberTwo");
   int num2  = in.nextInt();
   int  sum = num1 + num2;
    return sum;

  }

 }

