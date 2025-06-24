 class SortedArray_CH_43 {
     public static void main(String[] args) {
         System.out.println("Welcome to sorted Array");
         int[] numArr = ArrayUtility.inputArray();
         boolean isInc = isIncreasing(numArr);
         boolean isDec = isDecreasing(numArr);
         if(isInc || isDec){
             System.out.println("The Array is sorted");
         }
         else{
             System.out.println("The Array is not sorted");
         }
     }

     public static boolean isIncreasing(int[] Array){
         int i = 1;
         while(i < Array.length){
             if(Array[i] < Array[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }

     public static boolean isDecreasing(int[] Array){
         int i = 1;
         while(i < Array.length){
             if(Array[i] > Array[i -1]){
                 return false;
             }
             i++;
         }
         return true;
     }
}
