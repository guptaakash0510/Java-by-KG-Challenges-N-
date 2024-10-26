import java.util.Scanner;

class Simpleinterest_CH_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of P,T,R: ");
        double p=input.nextDouble();
        double t=input.nextDouble();
        double r=input.nextDouble();
        double s=(p*t*r)/100;
        System.out.println("Simple interest is: "+s);
    }
}
