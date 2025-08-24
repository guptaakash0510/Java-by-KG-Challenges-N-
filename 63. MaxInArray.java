import java.sql.SQLOutput;
import java.util.Scanner;

class MaxInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to maximum element finding in Array");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("The maximum element of the array is: " + max);
    }
}

