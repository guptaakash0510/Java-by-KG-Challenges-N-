import java.util.Scanner;

class ArrayOccurrences_CH_41 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Array Occurrences");
         int[] numArray = ArrayUtility.inputArray();
         System.out.print("Enter the element you want to search: ");
         int num = input.nextInt();
         int countNum = occurrence(numArray,num);
         if(countNum == 0){
             System.out.println("Your number is not found in the Array");
         }
         else {
             System.out.println("Number of occurrence of " + num + " in the Array is: " + countNum);
         }
     }

     public static int occurrence(int[] numArray,int element){
         int i = 0;
         int count = 0;
         while(i < numArray.length){
             if(numArray[i] == element){
                 count++;
             }
             i++;
         }
         return count;
     }
}
