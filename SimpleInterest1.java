  import java.util.Scanner;

public class SimpleInterest1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time (years): ");
        float t = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        float si = (p * t * r) / 100;
        System.out.println("Simple Interest = " + si);
    }
}


