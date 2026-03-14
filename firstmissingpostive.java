import java.util.*;

public class firstmissingpostive {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int expected = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < expected){
                continue;
            }

            if(nums[i] == expected){
                expected++;
            }

            else if(nums[i] > expected){
                break;
            }
        }

        System.out.println(expected);
    }
}