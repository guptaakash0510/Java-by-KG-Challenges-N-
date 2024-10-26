import java.util.Scanner;

 class leapyear2_CH {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to leapyear calculator");
         System.out.print("Enter a Year: ");
         int year = input.nextInt();
         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
             System.out.println("The year is Leapyear");
         } else {
             System.out.println("Year is not Leapyear");
         }
     }
 }





