import java.util.Scanner;

class Factorial_CH_30_b_Sir {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to factorial calculator");
         System.out.print("Enter any number: ");
         int number = input.nextInt();
         long total = factorial(number);
         System.out.println("The factorial of "+ number +" is: "+total);
     }

     public static long factorial(int num){
         int i = 2;
         int product = 1;
         if (num < 2){
             return 1;
         }
         while(i<=num){
             product *= i;
             i++;
         }
         return product;
     }
}
