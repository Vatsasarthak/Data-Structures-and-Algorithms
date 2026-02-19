import java.util.*;

public class backwardRecursion {

    static void recursion(int n) {
        if (n == 0) {      // base case
            return;
        }

        System.out.print(n + " "); // work first
        recursion(n - 1);          // then recursive call
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
}