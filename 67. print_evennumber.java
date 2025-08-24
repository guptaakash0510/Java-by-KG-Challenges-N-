class print_evennumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the even number printing\n");
        int[] numarray = ArrayUtility.inputArray();
        System.out.print("The even numbers are: ");
        for(int num : numarray) {
            if(num % 2 != 0){
                continue;
            }
            else{
                System.out.print(num + " ");
            }
        }
    }
}
