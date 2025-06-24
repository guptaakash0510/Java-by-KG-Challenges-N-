 class SumandAverage_2DArray_CH_49 {
     public static void main(String[] args) {
         System.out.println("Welcome to 2D Array sum and average");
         int[][] numArray = ArrayUtility.input2DArray();
         double totalSum = Sum(numArray);
         double average = Average(numArray);
         System.out.println("The sum of the Array element: " + totalSum);
         System.out.println("The average of the Array element: " + average);
     }

     public static double Sum(int[][] Array){
         int i = 0;
         int sum = 0;
         while(i < Array.length){
             int j = 0;
             while(j < Array.length){
                 sum = sum + Array[i][j];
                 j++;
             }
             i++;
         }
         return sum;
     }

     public static double Average(int[][] Array){
          double sum = Sum(Array);
          int totalElement = Array.length * Array.length ;
          double average = sum / totalElement;
         return average;
     }
}
