package exercise3;
import java.util.Scanner;
public class NumberCounter {
  public static void main (String [] args) {

    Scanner input = new Scanner(System.in);
  
    int number = input.nextInt();
    int countp = 0;
    int countn = 0;
    double sum = 0;

    while (number != 0 ) {
    if (number > 0) {
      countp++;
      sum = sum + number;
      number = input.nextInt();

    }
    else {
      countn++;
      sum = sum + number;
      number = input.nextInt();
    }        
    }
    double average = sum/ (countp + countn);

    System.out.println("Positive numbers: "+countp);
    System.out.println("Negative numbers: "+countn);
    System.out.println("Sum: "+sum);
    System.out.println("Average: "+average);

    
  }
}