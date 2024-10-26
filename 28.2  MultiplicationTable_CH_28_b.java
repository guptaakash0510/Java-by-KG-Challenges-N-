import java.util.Scanner;

class MultiplicationTable_CH_28_b {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcoome to multiplication table");
         System.out.print("Please enter your number: ");
         int a = input.nextInt();
         Table(a);
     }

     public static void Table(int num){
         int i = 1;
         while(i<=10){
             System.out.println(num+" x "+ i +" = "+(num * i));
             i++;
         }
     }
}
