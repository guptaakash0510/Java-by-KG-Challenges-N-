import java.util.Scanner;

class Exit_Onexit {
    public static void main(String[] args) {
        System.out.println("Welcome to exit code\n");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the correct code: ");
            String code = input.next();
            if (code.equals("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
