import java.util.Scanner;

 class BitwiseComplement_CH_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to complement operator");
        System.out.print("Enter any number: ");
        int a = input.nextInt();
        int r = ~a;
        System.out.println("The result is: "+r);
    }
}
