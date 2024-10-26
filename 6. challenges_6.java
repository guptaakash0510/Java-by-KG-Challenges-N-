import java.util.Scanner;

 class challenges_6 {
    public static void main(String[] args) {
   /*     int firstNumber = 88;
        int secondNumber = 92;
        int temp = firstNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println(firstNumber);
        System.out.println(secondNumber);    */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping");
        System.out.println("Enter two numbers");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();
        int temp=firstNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("After swapping Firstnumber: "+firstNumber);
        System.out.println("After swapping Secondnumber: "+secondNumber);
    }
}
