import java.util.Scanner;

class Password_Part_2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Password Checker\n");
         String password;
         do {
             System.out.print("Enter the password: ");
             password = input.next();
         }while(! isValidPassword(password));
         System.out.println("password matched succesfully");
     }

     public static boolean isValidPassword(String password) {
         return password.length() > 6;
     }
}
