import java.util.Scanner;

class CelciusFerenhite_CH_imp_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhite: ");
        double f=input.nextDouble();
        double c=(f-32)*(5.0/9); //important Line
        System.out.println("Temperature in celsius is: "+c);
       // float d = (f-32) * 5.0f *9.0f; (It is ffalse but caan be true if f is float)
    }
}
