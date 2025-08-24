package in.kgcoding.challenge_89;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Akash"));
        System.out.println(concatenate("Akash", "jain"));
        System.out.println(concatenate("Subscribe", "to", "KgCoding"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
