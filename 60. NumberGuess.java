import java.util.Scanner;

class NumberGuess {
     public static void main(String[] args) {
         int num = 5;
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the number guessing\n");
         int guess;
         do {
             System.out.print("Guess the number: ");
             guess = input.nextInt();
         } while(guess != num);

         System.out.println("The guessed number is correct");
     }
}
