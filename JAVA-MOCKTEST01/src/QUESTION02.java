/*
 * 2. Write a Java program to print the Fibonacci series up to a given number using a for loop.
 */
import java.util.Scanner;

public class QUESTION02 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci series up to " + numTerms + " terms: ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
