import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>(5);


 //   list.add(67);
   // list.add(674);
 //   list.add(567);
  //  list.add(367);
  //  list.add(867);


 //   System.out.println(list.contains(54334));
//    System.out.println(list);
  //  list.set(0, 99);

    // list.remove(2);

  //  System.out.println(list);

     for(int i = 0; i< 5; i++) {
       list.add(in.nextInt());

    } 

     //get item at any index 

      for(int i = 0; i< 5; i++) {
       list.add(in.nextInt());
  System.out.println(list.get(i));
    } 

    System.out.println(list);
  }
}
