import java.util.Scanner;

/* public class Fibo {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 10;

        System.out.print(n1 + " " + n2); // printing 0 and 1

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
 */



public class Fibo {
    public static void main(String[] args) {
        int n = 7;
      int a = 0;
      int b = 1;

      int count = 2;

      while (count <=n) {
          int  temp = b;
           b = b +  a;
            a= temp;
            count ++ ;
      }

      System.out.println(b);
     
 }
    }
