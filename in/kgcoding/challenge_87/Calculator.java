package in.kgcoding.challenge_87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.println("Now, enter the second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exeption) {
            if (exeption.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exeption;
            }
        }
    }
}
