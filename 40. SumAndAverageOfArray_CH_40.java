import java.util.Scanner;

class SumAndAverageOfArray_CH_40 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          System.out.println("Welcome to Sum and Average of Array");
          int[] numArr = ArrayUtility.inputArray();
          int totalSum = sumArray(numArr);
          double totalAverage = AverageArray(numArr);
          System.out.println("Sum of the Array elements are: " + totalSum);
          System.out.println("Average of the Array elements are: " + totalAverage);
     }

     public static int sumArray(int[] numArr){
          int i = 0;
          int sum = 0;
          while(i < numArr.length){
               sum = sum + numArr[i];
               i++;
          }
          return sum;
     }

     public static double AverageArray(int[] numArr){
         double sum =  sumArray(numArr);
          double average = sum / numArr.length;
          return average;
     }
}
