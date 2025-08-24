class PART_2_print_evennumbers_CH_67 {
    public static void main(String[] args) {
        System.out.println("Welcome to even number printing\n");
        System.out.print("The even numbers are: ");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                continue;
            }
            else{
                System.out.println(i + " ");
            }
        }
    }
}
