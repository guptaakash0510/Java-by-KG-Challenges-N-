import java.util.Scanner;

 class Oddevennumber_CH_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number cheaker");
        System.out.print("Enter any Number: ");
        int num=input.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is Even number");
        }
        else{
            System.out.println("The number is Odd Number");
        }
    }
}
