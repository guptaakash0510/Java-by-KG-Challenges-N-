import java.util.Scanner;

class ArmstrongNumber_CH_37 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Armstrong number identifier");
         System.out.print("Enter any number: ");
         int n = input.nextInt();
         int result = armstrong(n);
         if(result == n){
             System.out.println(n+" is a Armstrong number");
         }
         else{
             System.out.println(n+" is not a Armstong number");
         }
     }

     public static int armstrong(int num){
         int sum = 0;
         while(num != 0){
             int r = num % 10;
             sum = sum + r * r * r;
             num = num / 10;
         }
         return sum;
     }
}
