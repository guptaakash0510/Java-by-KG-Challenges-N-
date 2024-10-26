import java.util.Scanner;

 class Compoundinterest_CH_imp_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of P,R,t");
        double p=input.nextDouble();
        double r=input.nextDouble();
        double t=input.nextDouble();
        double c=p* Math.pow((1+r/100),t); // Since r is in double so the result "r/100" will also be Double.
        System.out.println("The compound interest is: "+c);
    }
}
