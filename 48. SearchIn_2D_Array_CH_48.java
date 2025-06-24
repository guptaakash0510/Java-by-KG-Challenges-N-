import java.util.Scanner;

class SearchIn_2D_Array_CH_48 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to 2D Array search");
         int[][] numArray = ArrayUtility.input2DArray();
         System.out.print("Enter the element you want to search: ");
         int num = input.nextInt();
         boolean isResult = isSearch(numArray,num);
         if(isResult){
             System.out.println("The element is found in the Array");
         }
         else{
             System.out.println("The element is not found in the Array");
         }
     }

     public static boolean isSearch(int[][] Array,int element){
         int i = 0;
         while(i < Array.length){
             int j = 0;
             while(j < Array.length) {
                 if (Array[i][j] == element) {
                     return true;
                 }
                 j++;
             }
             i++;
         }
         return false;
     }
}
