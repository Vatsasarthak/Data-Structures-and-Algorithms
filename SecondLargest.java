import java.util.*;

public class SecondLargest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > lar) {
                sec = lar;
                lar = nums[i];
            } else if (nums[i] < lar && nums[i] > sec) {
                sec = nums[i];
            }
        }

        if (sec == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sec);
        }
    }
}