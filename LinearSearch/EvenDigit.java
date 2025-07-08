public class EvenDigit {
  public static void main(String[] args) {
    
  }

  static int findNumbers(int[] nums) {
     int count = 0;
     for(int num: nums) {
      if(even(num)) {
        count++;
      }
     }

     return count;
  }
}
