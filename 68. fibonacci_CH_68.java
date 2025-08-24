import java.util.Scanner;

class fibonacci_CH_68 {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci series\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        fibonacci(num,a,b,c);
    }

    public static int fibonacci(int num, int a, int b, int c){
        while(c < num) {
            System.out.print(a + " ");
            c = b + a;
            a = b;
            b = c;
            if(c >= num){
                return 0;
            }
            else{
                fibonacci(num,a,b,c);
            }
        }
        return 0;
    }
}







