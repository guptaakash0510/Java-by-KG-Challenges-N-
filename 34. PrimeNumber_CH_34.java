import java.util.Scanner;

class PrimeNumber_CH_34 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to prime number identifier");
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         int count=0;
         for(int i=2;i<num;i++){
             if(num%i==0){
                 count++;
                 break;
             }
         }
         if(count==0){
             System.out.println(num+" is a prime number");
         }
         else{
             System.out.println(num+" is not a prime number");
         }
     }
}
