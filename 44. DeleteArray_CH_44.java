import java.util.Scanner;

class DeleteArray_CH_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to delete Array element and return New Array");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the element you want to delete: ");
        int num = input.nextInt();
        int[] Arr = newArr(numArr,num);
        ArrayUtility.Display(Arr);
    }

    public static int occurrence(int[] Array,int element ){
        int i = 0;
        int occ = 0;
        while(i < Array.length){
            if(Array[i] == element){
                occ++;
            }
            i++;
        }
        return occ;
    }

    public static int[] newArr(int[] Array, int element){
        int repeat = occurrence(Array, element);
        int size = Array.length - repeat;
        int[] newArray = new int[size];
        int i = 0;
        int j = 0;
        while(i < Array.length){
            if(Array[i] != element){
                newArray[j] = Array[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
