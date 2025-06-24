 class PalindromeArray_CH_46 {
     public static void main(String[] args) {
         System.out.println("Welcome to Palindrome Array");
         int[] numArray = ArrayUtility.inputArray();
         boolean isresult = isPalindrome(numArray);
         if(isresult){
             System.out.println("The given Array is Palindrome Array");
         }
         else{
             System.out.println("The given Array is not Palindrome Array");
         }
     }

     public static boolean isPalindrome(int[] Array){
         int[] oldArray = Array;
         int i = 0;
         while(i < Array.length / 2){
             if(Array[i] != Array[Array.length - 1 - i]){
                     return false;
             }
             i++;
         }
            return true;
         }

}
