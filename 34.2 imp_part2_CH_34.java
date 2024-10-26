import java.util.Scanner;

class part2_CH_34 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Welcome to prime number");
         System.out.print("Enter any number: ");
         int number = input.nextInt();
         boolean result = prime(number);
         if(result){
             System.out.println("The number is prime number");
         }
         else{
             System.out.println("The number is not a prime number");
         }
     }

     public static boolean prime(int num){
         int i = 2;
         while(i < num){
             if(num % i == 0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
