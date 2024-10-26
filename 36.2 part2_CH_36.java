import java.util.Scanner;

class part2_CH_36 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Fibonacci series");
         System.out.println("Enter any number: ");
         int num = input.nextInt();
         fibonacci(num);
     }

     public static int fibonacci(int num){
         int i = 1;
         int a = 0;
         int b = 1;
         int c = 0;
         while(i <= num){
             System.out.print(a + " ");
             c = a;
             a = b;
             b += c;
             i++;
         }
         return 0;
     }
}
