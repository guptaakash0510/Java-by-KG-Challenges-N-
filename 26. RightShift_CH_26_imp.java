import java.util.Scanner;

class Rightshift_CH_26_imp {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("WElcome to RightShift oparetor");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         int r =num >> 1; // In the place of 1 there can be any integer number.
         System.out.println("The result is: "+r);
     }

}
