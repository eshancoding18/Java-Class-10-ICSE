import java.util.Scanner;

public class BubbleSort {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Taking input from the user
        System.out.println("Enter 10 numbers to be sorted:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Bubble sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Displaying sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
