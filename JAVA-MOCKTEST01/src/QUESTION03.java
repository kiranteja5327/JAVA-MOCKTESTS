/*
 * 3. Write a Java program to calculate the average of a list of numbers using a do-while loop.
 */

import java.util.Scanner;

public class QUESTION03 {
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the numbers from the user
        System.out.print("Enter the numbers (separated by spaces): ");
        String input = scanner.nextLine();

        // Split the input into an array of numbers
        String[] numbers = input.split(" ");

        // Calculate the sum and count of numbers
        int sum = 0;
        int count = 0;

        // Calculate the sum using a do-while loop
        int i = 0;
        do {
            int number = Integer.parseInt(numbers[i]);
            sum += number;
            count++;
            i++;
        } while (i < numbers.length);

        // Calculate the average
        double average = (double) sum / count;

        // Print the average
        System.out.println("Average: " + average);
    }
}
