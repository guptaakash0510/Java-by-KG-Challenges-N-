import java.util.Scanner;

class Sum_continue {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to sum of positive numbers\n");
         int sum = 0;
         while(true){
             System.out.println("enter any positive number: ");
             int num = input.nextInt();
             if(num < 0) {
                 continue;
             }
             else {
                 sum = sum + num;
                 System.out.println("The total sum is: " + sum);
             }
         }
     }
}
