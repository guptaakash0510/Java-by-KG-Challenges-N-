import java.util.Scanner;

class multiplicationTable_CH_28 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to multiplication table");
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         System.out.println("The table of "+num+" is: ");

         for(int i=1;i<=10;i++){
             int total = num * i;
             System.out.println(total);
         }
     }
}
