//  Write a program to find factorial of a number
import java.util.*;

public class FindFactorial{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println("factorial of " +num+" is " + factorial);

		sc.close();
	}
}