import java.util.Scanner;

class OddEvenTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to odd even checker");
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         OddEvenTernary ternary = new OddEvenTernary();
         boolean isResult = ternary.checker(num);
         if(isResult){
             System.out.println("The number is even number");
         }
         else{
             System.out.println("The number is odd number");
         }
     }

     public boolean checker (int num){
         return (num % 2 == 0) ? true : false ;
     }
}
