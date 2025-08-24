import java.util.Scanner;

class MultiplicationTable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to thw multiplication table");
         System.out.println("Please enter a number: ");
         int num = input.nextInt();
         int digit;
         System.out.println("The Multiplication Table of " + num + " is: ");

         for (int i = 1; i <=10; i++){
             digit = num * i;
             System.out.print(digit + " ");
         }
     }
}
