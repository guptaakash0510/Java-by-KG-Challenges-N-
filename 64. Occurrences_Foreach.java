import java.util.Scanner;

class Occurrences_Foreach {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          System.out.println("Welcome to the element occurrences\n");
         int[] array = ArrayUtility.inputArray();
          System.out.print("Enter the element you want search: ");
          int element = input.nextInt();
          int count = 0;
          for (int num : array) {
               if(num == element){
                    count++;
               }
          }
          if(count == 0) {
               System.out.println("The element is not found in the array");
          }
          else {
               System.out.println("The element is found " + count + " times in the array");
          }
     }

}
