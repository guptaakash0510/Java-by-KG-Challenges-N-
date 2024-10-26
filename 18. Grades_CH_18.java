import java.util.Scanner;

 class Grades_CH_18 {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator");
        System.out.println("Enter your marks: ");
        int grade = input.nextInt();

        if(grade >= 90){
            System.out.println("Your grade is : A");
        }
        else if(grade>=75 && grade<90){
            System.out.println("Your grade is: B");
        }
        else if(grade>=60 && grade<75){
            System.out.println("Your grade is: C");
        }
        else if(grade>=30 && grade<60){
            System.out.println("Your grade is: D");
        }
        else{
            System.out.println("Your grade is: F");
        }
    }
}
