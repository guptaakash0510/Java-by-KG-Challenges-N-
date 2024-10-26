import java.util.Scanner;

class part2_CH_35 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Reverse number");
         System.out.print("Enter any number: ");
         int number = input.nextInt();
         int result = reverse(number);
         System.out.println("The reverse of "+ number +" is: "+ result);
     }

     public static int reverse(int num){
         int newNumber = 0;
         while(num != 0){
             int digit = num % 10;
             /* newNumber += digit;
             newNumber *= 10; */ // Here we can use sum = sum * 10 + reminder
             newNumber = newNumber * 10 + digit;
             num = num / 10;
         }

         return newNumber;
     }
}
