import java.util.Scanner;

 class BitwiseXor_CH_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Xor operator");
        System.out.println("enter any two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int r = a^b;
        System.out.println("The result is: "+r);
    }
}
