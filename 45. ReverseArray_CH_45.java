 class ReverseArray_CH_45 {
     public static void main(String[] args) {
         System.out.println("Welcome to Array Reversal");
         int[] numArr = ArrayUtility.inputArray();
         int[] newArray = ReverseArray(numArr);
         ArrayUtility.Display(newArray);
     }

     public static int[] ReverseArray(int[] Array){
         int i = 0;
         while(i < Array.length / 2){
             int swap = Array[i];
             Array[i] = Array[Array.length - 1 - i];
             Array[Array.length -1 -i] = swap;
             i++;
         }
         return Array;
     }
}
