import java.util.Scanner;

class AbsoluteTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to absolute number");
         System.out.print("Enter any number: ");
         double num = input.nextInt();
         double result = (num < 0) ? -num : num ;
         System.out.println("The absolute number is: " + result);
     }
}
