 class part_2_DiagonalSum_2D_CH_50 {
     public static void main(String[] args) {
         System.out.println("Welcome to Diagonal sum of 2D Array");
         int[][] numArray = ArrayUtility.input2DArray();
         boolean isSize = issize(numArray);


         if(isSize){
             evenSum(numArray);
         }
         else{
             oddSum(numArray);
         }
     }


     public static boolean issize(int[][] Array){
         if(Array.length % 2 == 0){
             return true;
         }
         else{
             return false;
         }
     }
     public static void oddSum(int[][] Array){
         int i = 0;
         int j = 0;
         int middle = (Array.length - 1) / 2;
         int size = Array.length;
         int sum1 = 0;
         int sum2 = 0;
         while(i < Array.length){
             sum1 = sum1 + Array[i][j];
             i++;
             j++;
         }
         i = 0;
         j = size - 1;
         while(i < size){
             sum2 = sum2 + Array[i][j];
             i++;
             j--;
         }
         int sum12 = sum1 +sum2 - Array[middle][middle];
         System.out.println("The sum is: " + sum12);
     }

     public static void evenSum(int[][] Array){
         int i = 0;
         int j = 0;
         int size = Array.length;
         int sum3 = 0;
         int sum4 = 0;
         while(i < size){
             sum3 = sum3 + Array[i][j];
             i++;
             j++;
         }
        // System.out.println("sum = " + sum3);
         i = 0;
         j = size -1;
         while(i < size){
             sum4 = sum4 + Array[i][j];
             i++;
             j--;
         }
         int sum34 = sum3 + sum4;
         System.out.println("The sum is: " + sum34);
     }
}
