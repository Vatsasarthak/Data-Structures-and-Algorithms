import java.util.*;

public class Swaps {

    public static int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] trailingZeros = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0 && grid[i][j] == 0; j--) {
                count++;
            }
            trailingZeros[i] = count;
        }
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int required = n - i - 1;
            int j = i;
            while (j < n && trailingZeros[j] < required) {
                j++;
            }

            if (j == n) {
                return -1; // Not possible
            }
            while (j > i) {
                int temp = trailingZeros[j];
                trailingZeros[j] = trailingZeros[j - 1];
                trailingZeros[j - 1] = temp;
                swaps++;
                j--;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {

        int[][] grid1 = {
                {0, 0, 1},
                {1, 1, 0},
                {1, 0, 0}
        };

        int[][] grid2 = {
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0}
        };

        int[][] grid3 = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 1}
        };

        System.out.println("Output 1: " + minSwaps(grid1)); // Expected: 3
        System.out.println("Output 2: " + minSwaps(grid2)); // Expected: -1
        System.out.println("Output 3: " + minSwaps(grid3)); // Expected: 0
    }
}