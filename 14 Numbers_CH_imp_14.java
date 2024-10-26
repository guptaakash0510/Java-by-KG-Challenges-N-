import java.util.Scanner;

class Numbers_CH_imp_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        double num = input.nextDouble();
        if(num > 0){
            System.out.println("The number is Positive number");
        }
        else if(num < 0){
            System.out.println("The number is Negetive number");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
}
