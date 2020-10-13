package exercise3;
import java.util.Scanner;
public class NumberCounter {
  public static void main (String [] args) {

    Scanner input = new Scanner (System.in);
  
    int number = input.nextInt ();
    int countp = 0;
    int countn = 0;
    int sum = 0;

    while (number != 0 ) {
    if (number > 0) {
      countp++;
      sum = sum + number;
    }
    else {
      countn++;
      sum = sum + number;
    }    
    int average = sum/ (countp + countn);

    System.out.println ("Positive numbers: " + countp);
    System.out.println ("Negatve numbers: " + countn);
    System.out.println ("Sum: " + sum);
    System.out.println ("Average: " + average);

    }

    
  }
}