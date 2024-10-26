import java.util.Scanner;

 class LeftShift_CH_25_imp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LeftShift operator");
        System.out.print("Enter any number: ");
        int a=input.nextInt();
        int r= a<<2;
        System.out.println("The Result is: "+r);
    }
}
