
/*
 * 1. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
 */
import java.util.Scanner;
public class QUESTION01 {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=num.nextInt();
		
		if(number>0)
		{
			System.out.println("Number is positive");
		}
		else if(number<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
		
	}

}
