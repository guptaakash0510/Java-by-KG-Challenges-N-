import java.util.Scanner;

class part2_CH_37 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Armstrong number");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         int numcopy = num;
         int result = armstrong(num);
         if(numcopy == result){
             System.out.println("The given number is a Armstrong number");
         }
         else{
             System.out.println("The given number is not an Armstrong number");
         }
     }

     public static int subs(int num){
         int count = 0;
         while(num != 0){
             count ++;
             num = num / 10;
         }
         return count;
     }

     public static int power(int num, int pow){
         int i = 1;
         int product = 1;
         while(i <= pow){
             product = product * num;
             i++;
         }
         return product;
     }

     public static int armstrong(int num){
         int total = 0;
         int numcopy = num;
         int power1 = subs(num);
         while(num != 0) {
             int digit = num % 10;
             total = total + power(digit,power1);
             num = num /10;
         }
         return total;
     }
}
