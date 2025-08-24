import java.util.Scanner;

class string_palindrome_CH_69 {
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome string finding\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
       // System.out.println("your string is: " + word);
        System.out.println("Your string is "
                + (ispalindrome(word) ? "palindrome"
                                      : "Not palindrome"));
    }

    public static boolean ispalindrome(String word){
        if(word.length() <= 1){
            return true;
        }
        int lastpos = word.length() - 1;
        if(word.charAt(0) != word.charAt(lastpos)) {
            return false;
        }
        String newword = word.substring(1,lastpos);
        return ispalindrome(newword);
    }
}
