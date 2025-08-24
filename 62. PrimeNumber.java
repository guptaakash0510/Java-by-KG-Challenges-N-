import java.util.Scanner;

class PrimeNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to prime number finder\n");
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         boolean isPrime = FindPrime(num);
         if(isPrime) {
             System.out.println("The given number is a prime number");
         }
         else {
             System.out.println("The given number is not a prime number");
         }

     }

     public static boolean FindPrime(int num) {
         if (num < 2) {
             return false;
         }
         else {
             for (int i = 2; i < num; i++) {
                 if (num % i == 0) {
                     return false;
                 }
             }
         }
         return true;
     }
}
