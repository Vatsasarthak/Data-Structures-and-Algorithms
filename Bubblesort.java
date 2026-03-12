public class Bubblesort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {        // n-1 passes
            for (int j = 0; j < n - 1 - pass; j++) {      // shrinks each pass
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j]   = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 6};

        bubbleSort(nums);

        System.out.print("Sorted: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output → Sorted: 1 3 5 6 8
    }
}