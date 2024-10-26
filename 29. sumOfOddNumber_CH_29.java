import java.util.Scanner;

class sumOfOddNumber_CH_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of odd number");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        System.out.println("The sum is: ");
       /* if (num == 1) {
            sum = num;
            System.out.println("The total is: " + sum); */


            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
            System.out.println("The total is: "+sum);
        }
    }
