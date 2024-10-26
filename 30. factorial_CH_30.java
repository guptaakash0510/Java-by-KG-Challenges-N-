import java.util.Scanner;

class factorial_CH_30 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to factorial calculator");
         System.out.print("Enter a number: ");
         int f = input.nextInt();
         int total = factorial(f);
         System.out.println("The factorial is: "+total);
     }

     public static int factorial(int num){
         int product=1;
         for(int i=1;i<=num;i++){
             product = product * i;
         }
        return product;
     }
}
