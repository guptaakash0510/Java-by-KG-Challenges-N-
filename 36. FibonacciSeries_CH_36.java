import java.util.Scanner;

class FibonacciSeries_CH_36 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Fibonacci Series");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         System.out.println("The fibonacci series is: ");
         fibo(num);

     }
     public static int fibo(int n){
         int num1 = 0;
         int num2 = 1;
         int num3;
         for(int i=0;i<n;i++){
             System.out.print(num1+" ");
             num3 = num1 + num2;
             num1 = num2;
             num2 = num3;
         }
         return 0;
     }
}
