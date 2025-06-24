import javax.swing.event.RowSorterListener;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element number in the Array: ");
        int size = input.nextInt();
        int[] Array = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter the element number " + (i + 1)+ " : ");
            int num = input.nextInt();
            Array[i] = num;
            System.out.println();
            i++;
        }
        return Array;
    }

    public static void Display(int[] Array){
        int i = 0;
        System.out.print("Your new Array is: ");
        while(i < Array.length){
            System.out.print(Array[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number in Array: ");
        int Row = input.nextInt();
        System.out.println("Enter the coloumn number in the Array");
        int Coloumn = input.nextInt();
        int[][] Array = new int[Row][Coloumn];
        int i = 0;

        while(i < Row){
            int j = 0;
            while(j < Coloumn){
                System.out.print("Enter the element of " + (i+1) + "  row and " + (j+1) + " coloumn: ");
                Array[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return Array;
    }
}
