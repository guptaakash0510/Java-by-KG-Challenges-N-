import java.util.Scanner;

class part2_CH_38 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Palindrome Number");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         int numcopy = num;
         int result = palindrome(num);
         if(numcopy == result){
             System.out.println("The given number is Palindrome number");
         }
         else{
             System.out.println("The given number is not a palindrome number");
         }
     }

     public static int palindrome(int num){
         int sum = 0;
         while(num != 0){
             int digit = num % 10;
             sum = (sum * 10) + digit;
             num = num / 10;
         }
         return sum;
     }
}
