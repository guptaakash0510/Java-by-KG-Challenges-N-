import java.util.Scanner;

class Grades2_CH {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the Grade Calcultor");
         System.out.print("Enter your marks: ");
         int m = input.nextInt();

         if(m>90){
             System.out.println("Your grade is A");
         }
         else if(m>=75){
             System.out.println("Your grade is B");
         }
         else if(m>=60){
             System.out.println("Your grade is C");
         }
         else if(m>=30){
             System.out.println("Your grade is D");
         }
         else if(m<30){
             System.out.println("You have Failed");
         }
     }
}
