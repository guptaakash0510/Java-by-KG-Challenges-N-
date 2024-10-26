import java.util.Scanner;

 class Perimeter_CH_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 4 sides of the rectangle: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int p=(a+b+c+d);
        System.out.println("The perimeter of the rectangle is: "+p);
    }
}
