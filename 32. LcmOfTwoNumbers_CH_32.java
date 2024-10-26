import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class LcmOfTwoNumbers_CH_32 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to LCM Calulator");
         System.out.println("enter any two number: ");
         int firstNumber = input.nextInt();
         int secondNumber = input.nextInt();
         int result = (firstNumber>secondNumber) ? firstNumber : secondNumber;

         while(true){
             if(result % firstNumber == 0 && result % secondNumber == 0)
                 break;
             result++;
         }
         System.out.println("The LCM of "+firstNumber+" and "+secondNumber+" is: "+result);
     }
 }
