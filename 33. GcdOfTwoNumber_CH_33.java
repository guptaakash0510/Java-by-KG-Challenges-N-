import java.util.Scanner;

class GcdOfTwoNumber_CH_33 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to GCD Calcutor");
         System.out.println("Enter any two number: ");
         int n = input.nextInt();
         int m = input.nextInt();
         int total = GcdOfTwoNumber(n,m);
         System.out.println("The GCD of "+n+" and "+m+" is :"+total);
     }

     public static int GcdOfTwoNumber(int a, int b){
         int result = (a < b) ? a : b;
         while(true){
             if(a % result == 0 && b % result == 0){
                 break;
             }
             result--;
         }
         return result;
     }
}
