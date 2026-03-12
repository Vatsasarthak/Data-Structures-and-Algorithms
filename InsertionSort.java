public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1};
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i]; // pick current element
            int j = i - 1;

            // shift elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // insert in correct position
        }

        for (int x : arr) {
            System.out.print(x + " "); // 1 3 5 8
        }
    }
}