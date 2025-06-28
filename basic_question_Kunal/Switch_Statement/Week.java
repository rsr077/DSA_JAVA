/* 
public class Week {
  public static void main(String[] args) {
    String Weeks = "5";

    switch (Weeks) {
      case "1":  
      System.out.println("Monday");
      break;
      case "2":  
      System.out.println("Monday");
      break;
      case "3":  
      System.out.println("Tuesday");
      break;
      case "4":  
      System.out.println("Wednesday");
      break;
      case "5":  
      System.out.println("Thurday");
      break;
      case "6":  
      System.out.println("Friday");
      break;
    }
  }
} */


public class Week {
  public static void main(String[] args) {
    int Weeks = 2;

   /*  switch (Weeks) {
      case "1" -> System.out.println("Monday");
      case "2" -> System.out.println("Monday");
      case "3" -> System.out.println("Tuesday");
      case "4" ->  System.out.println("Wednesday");
      case "5" -> System.out.println("Thurday");
      case "6" ->   System.out.println("Friday");

    } */

    switch (Weeks)  {
       case 1,2,3,4,5 -> System.out.println("Weekend");
       case 6, 7 -> System.out.println("Weekend");
    }
  }
}