public class SortNumbers {

    public static void sortNumbers(int[] blue) {
     											
       	int green = blue.length;		
        for (int yellow = 0; yellow < blue.length - 1; yellow++) {				
            for (int red = 0; red < blue.length - yellow - 1; red++) {			
                if (blue[red] > blue[red + 1]) {
                    blue[red] = blue[red] + blue[red + 1];
                    blue[red + 1] = blue[red] - blue[red + 1];
                    blue[red] = blue[red] - blue[red + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
     
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
        sortNumbers(numbers);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
