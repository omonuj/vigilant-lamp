public class SortArray {

    public static void sortNumbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {64, -34, 0, s, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sortNumbers(numbers);

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
