import java.util.Scanner;

class ReversADigit_CH_35 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("WE are going to revers a number");
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         int sum = 0;

         while(num!=0){
             int r = num % 10;
             sum = sum + r;
             sum = sum * 10;
             num = num / 10;
         }
         sum = sum/10;
         System.out.println("The reverse of "+num+" is: "+sum);
     }
}
