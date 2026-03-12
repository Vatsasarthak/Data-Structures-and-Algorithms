import java.util.Scanner;

class triangrpascal {

    public long findPascalElement(int r, int c) {


        int n = r - 1;
        int k = c - 1;

        long result = 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }

        return result;
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row (r): ");
        int r = sc.nextInt();

        System.out.print("Enter column (c): ");
        int c = sc.nextInt();

        Solution sol = new Solution();
        long result = sol.findPascalElement(r, c);

        System.out.println("Pascal Triangle Element = " + result);

        sc.close();
    }
}