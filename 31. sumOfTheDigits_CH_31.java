import java.util.Scanner;

class sumOfTheDigits_CH_31{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number's sum");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;


        while(num != 0){
            int d = num % 10;
            sum = sum + d;
             num = num / 10;
        }
        System.out.println("The total is: "+sum);
    }
}
