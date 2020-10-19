package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();

        for (int i = 0; i<name.length(); i++) {
          char letter = name.charAt(i);
          System.out.print ("* ");
          System.out.println (letter+" *");
          
        }
    }
}