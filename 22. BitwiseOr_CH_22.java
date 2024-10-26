import java.util.Scanner;

class BitwiseOr_CH_22 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Bitwise Or operation");
         System.out.println("Enter any two number: ");
         int a=input.nextInt();
         int b = input.nextInt();
         int r = a | b;
         System.out.println("The result is: "+r);

     }
}
