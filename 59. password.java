import java.util.Scanner;

class password {
     public static void main(String[] args) {
         System.out.println("Welcome to password Checker\n");
         int original_password = 6378;
         Scanner input = new Scanner(System.in);
         int num;
         do {
             System.out.println("enter your password: ");
             num = input.nextInt();
         } while(num != original_password );
         System.out.println("Password matched succesfully");
     }
}
