 class SumOfDiagonal_2DArray_CH_50 {
     public static void main(String[] args) {
         System.out.println("Welcome to sum of Diagonal elements");
         int[][] numArray = ArrayUtility.input2DArray();
         int sum = Sum(numArray);
         System.out.println("The sum of the Diagonal elements are: " + sum);
     }

     public static int Sum(int[][] Array){
         int i = 0;
         int sum = 0;
         while(i < Array.length){
             int j = 0;
             while(j < Array.length){
                 sum = sum + Array[i][j];
                 j = j + (Array.length -1);
             }
             i = i + (Array.length - 1);
         }
         return sum;
     }
}
