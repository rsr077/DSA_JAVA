

public class Max {
  public static void main(String[] args) {

 /*  Scanner in =new Scanner  (System.in);
   int a = in.nextInt();
   int b = in.nextInt(); */
   /* int c = in.nextInt(); */

 /*    int max = a;
    if(b > max) {
      max = b;
    }

    if(c > max) {
      max = c;
    }
    System.out.println(max);
  } */

 /*   int max = Math.max(a, b);
   System.out.println(max); */

   int []  marks = new int[3];

   marks[0] = 10;
   marks[1] = 20;
   marks[2] = 30;
   

   for(int i = 0 ; i< marks.length; i++) {
         System.out.println("Student " + (i+1) + " Marks: " + marks[i]); 
        
        
        
System.out.printf("marks[%d] = %d\n", i, marks[i]);

   }

  
}
}
