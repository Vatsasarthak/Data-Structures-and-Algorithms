import java.util.Scanner;

public class PalindromeCheckString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        boolean res = Palind(n);
        System.out.println(res);
    }

    public static boolean Palind(String n) {

        int left = 0;
        int right = n.length() - 1;

        while (left < right) {
            if (n.charAt(left) != n.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}