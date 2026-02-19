import java.util.*;

public class forwardRecursion {

    static void recursion(int n) {
        if (n == 0) {          // base case
            return;
        }
        recursion(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
}