import java.util.*;

public class RotateImage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Row-");
        int n = sc.nextInt();

        System.out.println("Enter the Column-");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] tras = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tras[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < m; i++){

            int left = 0;
            int right = n - 1;

            while(left < right){

                int temp = tras[i][left];
                tras[i][left] = tras[i][right];
                tras[i][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Rotated Matrix:");

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(tras[i][j] + " ");
            }
            System.out.println();
        }
    }
}