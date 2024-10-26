import java.util.Scanner;

class Oddsumnumber_CH_29_b {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to odd sum calculator");
         System.out.print("Enter any number: ");
         int a = input.nextInt();
         int total = oddSum(a);
         System.out.println("The sum till "+ a +" is "+ total);
     }

     public static int oddSum(int num){
         int sum = 0;
         int i = 1;
         while(i<=num) {
             sum+=i;
             i+=2;
         }
         return sum;
     }
}
