import java.util.Scanner;

public class Partitions {

    public static int minPartitions(String n) {
        int maxDigit = 0;

        for (char c : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');
        }

        return maxDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String n = sc.nextLine();

        int result = minPartitions(n);
        System.out.println("Minimum deci-binary numbers needed: " + result);

        sc.close();
    }
}