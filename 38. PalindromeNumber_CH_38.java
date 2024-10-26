import java.util.Scanner;

class PalindromeNumber_CH_38 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to palindrome identifier: ");
         System.out.print("Enter a number: ");
         int a = input.nextInt();
         int reverse = palindrome(a);
         if(reverse == a){
             System.out.println(a+" is palindrome number");
         }
         else{
             System.out.println(a+" is not a palindrome number");
         }
     }
     public static int palindrome(int num){
         int sum = 0;
         while(num != 0) {
             int r = num % 10;
             sum = sum + r;
             sum = sum * 10;
             num = num / 10;
         }
         sum = sum / 10;
         return sum;
     }
}
