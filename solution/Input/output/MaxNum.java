public class MaxNum {
  public static void main(String[] args) {
   
   int[] num = {1, 3, 4,5, 6};

   int Max = num[0];

    for(int i = 0; i<num.length; i++) {
       if(num[i] > Max) {
        Max = num[i];
       }
     
    }

       System.out.println(Max);

  }
}
