import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];

        // Read numbers from user
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // Sort numbers in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
