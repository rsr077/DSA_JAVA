import java.util.Scanner;


public class Prime {

    public static void main(String[] args) {
        int num = 2;

        for(int i = 2; i< num; i++){
            if(num % i == 0){
                System.out.println(num + " is NOT a               Prime Number.");
                return;
            }
        }
    }
}


/* public class Prime { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
    */ 
