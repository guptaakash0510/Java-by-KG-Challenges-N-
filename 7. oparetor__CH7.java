import java.util.Scanner;

 class oparetor__CH7 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition is: "+(a+b));
        System.out.println("Substraction is: "+(a-b));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
    }
}
