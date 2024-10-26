import java.util.Scanner;

class EvenOrOddBitwise_CH_27_imp {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to even or odd using Bitwise operator");
         System.out.print("Enter any number: ");
         int num=input.nextInt();
         int r = num & 1;

         if (r == 0){
             System.out.println("The number is Even number");
         }
         else {
             System.out.println("The number is Odd number");
         }
     }
}
