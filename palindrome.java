import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("please enter a word to check whether it's a Palindrome or not");
        Scanner scan = new Scanner(System.in);
        String check = scan.nextLine();
        String rev = "";

        for (int i = check.length() - 1; i <= check.length(); i--) {
            System.out.println(check.charAt(i));
            char s = check.charAt(i);
            rev = rev + String.valueOf(s);
            if (i == 0) {
                break;
            }
        }
        if (rev.equals(check)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not  palindrome");
        }
    }

}
