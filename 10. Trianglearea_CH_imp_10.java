import java.util.Scanner;

class Trianglearea_CH_imp_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of Triangle: ");
        double b=input.nextDouble();
        System.out.println("Enter the height of Triangle: ");
        double h=input.nextDouble();
        double a=0.5 *b * h;  //importnt Line
        System.out.println("The area of the Triangle is: "+a);

    }
}
