import java.util.Scanner;

public class NumberCalculator {
   
   public static int calculateNum(int num1, int num2){
      
      return (num1 * num2)+6;
      }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInput1;
      int numInput2;
      int result;
      
      numInput1 = scnr.nextInt();
      numInput2 = scnr.nextInt();
      
      result = calculateNum(numInput1, numInput2);
      
      System.out.println(result);
   }
}
