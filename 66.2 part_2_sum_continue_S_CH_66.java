 class part_2_sum_continue_S_CH_66 {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of numbers\n");
        int[] array = ArrayUtility.inputArray();
        int sum = 0;
        for(int num : array){
            if (num < 0){
                continue;
            }
            else{
                sum = sum + num;
            }
        }
        System.out.println("The total sum is: " + sum);
    }
}
