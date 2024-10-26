import java.util.Scanner;
class oparetor_CH_imp_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two floating point numbers: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double p = a*b;
        System.out.println("Product is: "+p);
        // Now let's see the addition
        System.out.println("The addition is: "+a+b); // important Line
        System.out.println("Now the addition is: "+(a+b));
    }

}
