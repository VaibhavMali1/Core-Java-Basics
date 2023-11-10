import java.io.*;
import java.util.Scanner;
public class RDDARB {
   public static void main(String[] args){
      int num, rem;
      int rev = 0, sum = 0;
      System.out.println("Enter the desired number: 07102001 ");
      num = 07102001;
      do {
         rem = num % 10;
         rev = rev * 10 + rem;
         sum = sum + rem;
         num = num / 10;
      }
      while (num > 0);
      System.out.println("Reverse of the given number is : " + rev);

      System.out.println("Sum of digits of the given number is: " + sum);
   }
}