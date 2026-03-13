import java.util.*;

public class findDuplicate {

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ask size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // ask elements
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = findDuplicate(nums);

        System.out.println("Duplicate number is: " + result);

        sc.close();
    }
}