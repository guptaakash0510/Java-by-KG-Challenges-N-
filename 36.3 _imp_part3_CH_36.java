import java.util.Scanner;

class part3_CH_36 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to fibonacci series");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         fibonacci(num);
     }

     public static int fibonacci(int num){
         if(num < 0) return 0;
         System.out.print("0 ");
         if(num == 0) return 0;
         System.out.print("1 ");
         int first = 0;
         int second = 1;
         while((first + second) < num){
             int third = first + second;
             System.out.print(third + " ");
             first = second;
             second = third;
         }
         return 0;
     }
}
