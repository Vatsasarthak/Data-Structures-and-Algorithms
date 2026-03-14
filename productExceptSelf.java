import java.util.*;

public class productExceptSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        // LEFT PREFIX PRODUCT
        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        // RIGHT SUFFIX PRODUCT
        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        // FINAL ANSWER
        for(int i = 0; i < n; i++){
            ans[i] = left[i] * right[i];
        }

        // PRINT RESULT
        System.out.println(Arrays.toString(ans));
    }
}