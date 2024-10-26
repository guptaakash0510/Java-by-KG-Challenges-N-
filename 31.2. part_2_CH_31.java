import java.util.Scanner;

class part_2_CH_31 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to sum of digits");
         System.out.print("Enter any number: ");
         int a = input.nextInt();
         int b = sumOfDigits(a);
         System.out.println("The sum of digits of "+ a +" is "+ b);
     }

     public static int sumOfDigits(int num){
         int sum = 0;
         while(num != 0){
             int r = num % 10;
             sum += r;
             num = num / 10;
         }

         return sum;
     }
}
