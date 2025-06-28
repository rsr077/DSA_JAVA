

public class LargestLoop {
   public static void main(String [] args){
     int[]  arr = {10,25,30,  5,15} ;

     int largest = arr[0];

     for(int i = 1; i < arr.length; i++)  {
      if(arr[i]  > largest) {

      
      largest = arr[i];
     }
   }

   System.out.println(largest);
}
}