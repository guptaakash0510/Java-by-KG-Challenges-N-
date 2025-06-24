import java.util.Scanner;

class studentScoreTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to student Score \n");
         System.out.print("Please enter your Score: ");
         int score = input.nextInt();
         String result = (score > 80) ? "High" : (score > 50 ? "Moderate" : "Low");
         System.out.println("Your grade is: " + result);
     }
}
