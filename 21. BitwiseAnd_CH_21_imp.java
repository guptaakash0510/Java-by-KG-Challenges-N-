import java.util.Scanner;

class BitwiseAnd_CH_21 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Bitwise And operation");
         System.out.println("Enter any two number: ");
         int a = input.nextInt();
         int b = input.nextInt();

         int s = a & b;
         System.out.println("The Result is : "+s);
     }

}
