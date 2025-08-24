import java.util.Scanner;

class part_2_fibonacci_recursion_CH_68 {
    public static void main(String[] args) {
        System.out.println("Welcome to the fibonacci series through recursion\n");
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();
        for(int i = 1; i <= position; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
        System.out.print(".");
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
