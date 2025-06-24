import java.util.Scanner;

class calculatorSwitch {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to calculator Switch");
         System.out.println("Enter the first number: ");
         int num1 = input.nextInt();
         System.out.println("Enter the second number: ");
         int num2 = input.nextInt();
         System.out.print("Enter the operation you want to execute: ");
         String operation = input.next();
         int result = cal(num1,num2,operation);
         System.out.println("The result of the operation is: " + result);
     }

     public static int cal(int num1, int num2,String operation){
         int data = switch (operation){
             case "+" -> num1 + num2;
             case "-" -> num1 - num2;
             case "*" -> num1 * num2;
             case "/" -> num1/num2;
             default -> -1;
         };
         return data;
     }
}
