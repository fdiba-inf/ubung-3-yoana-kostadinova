package exercise3;
import java.util.Scanner;
public class PrimeNumber {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number > 2: ");
  
    int number = input.nextInt();
    int del = 2;
    boolean prime = true;

    while (del<number) {
      if (number%del == 0) {
        prime = false;
        break;
      }
      del++;
    }
    System.out.println("Prime number: " +prime);
  }
}