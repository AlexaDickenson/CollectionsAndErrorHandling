import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate

        try {
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);
            System.out.println("List of integers without duplicates: " + uniqueNumbers);

            int sum = calculateSum(numbers);
            double average = calculateAverage(numbers);

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds error occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument error occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }

    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(List<Integer> numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.size();
    }
}
