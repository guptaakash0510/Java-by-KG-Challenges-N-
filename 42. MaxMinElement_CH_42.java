 class MaxMinElement_CH_42 {
     public static void main(String[] args) {
         System.out.println("Welcome to max min element in Array");
         int[] numArr = ArrayUtility.inputArray();
         int minelement = min(numArr);
         int maxelement = max(numArr);
         System.out.println("The maximum element of the Array is: " + maxelement);
         System.out.println("The minimum element of the Array is: " + minelement);
     }

     public static int min(int[] Array){
         if(Array.length == 0){
             return -1;
         }
         int i = 1;
         int min = Array[0];
         while(i < Array.length){
             if(Array[i] < min){
                 min = Array[i];
             }
             i++;
         }
         return min;
     }

     public static int max(int[] Array){
         int i = 0;
         int max = Array[0];
         while(i < Array.length){
             if(Array[i] > max){
                 max = Array[i];
             }
             i++;
         }
         return max;
     }
}
