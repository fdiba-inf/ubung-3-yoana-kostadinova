package exercise3;

import java.util.Scanner;

public class BasicInputLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        do {
            System.out.println("Enter two numbers: ");
            a = input.nextInt();
            b = input.nextInt();
            boolean positive = (a > 0 && b > 0);
            System.out.println("Positive numbers: " + positive);
        } while (a != 0 || b != 0);

        System.out.println("End");
    }

}
