

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

  /*  int []  marks = new int[3];

   marks[0] = 10;
   marks[1] = 20;
   marks[2] = 30;
   

   for(int i = 0 ; i< marks.length; i++) {
         System.out.println("Student " + (i+1) + " Marks: " + marks[i]); 
        
        
        
System.out.printf("marks[%d] = %d\n", i, marks[i]); */

/* int [] marks = {0,0,1};

int max = marks[2];
for(int i = 0; i<marks.length; i++) {
  if(marks[i] > max){
     max = marks[i];
  }
 
}
 System.out.println( max);
   */

  
        int[] marks = {3, 4, 6, 3, 2, 1};
        
        int startIndex = 2; // 👈 Start checking from index 1 (i.e., value 4)
        int max = marks[startIndex]; // Start max from that index
        
        for (int i = startIndex; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        System.out.println("Max from index " + startIndex + ": " + max);
    }
}



   

  


