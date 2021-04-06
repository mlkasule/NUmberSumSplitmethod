
/**
 * Write a program that asks the user to enter a series of numbers separated by commas. 
 * Here is an example of valid input: 7,9,10,2,18,6.
 * The program should calculate and print the sum of all the numbers.
 * Sample Run.
 * java NumberSum.
 * Enter·numbers·separated·by·commas:1,2,3↵
 * 6↵
 * 
 * @author Mark Kasule
 */
import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ask user to enter values with commas
		System.out.print("Enter numbers separated by commas: ");
		String numbers = input.nextLine();
		// print sum
		System.out.println(numberSum(numbers));

	}

	/**
	 * Convert to integers and sum up values
	 * 
	 * @param num String to be converted
	 * @return the sum of values
	 */
	public static int numberSum(String num) {
		// split and trim the string
		String[] tokens = num.split(",");

		int sum = 0;
		for (String val : tokens) {
			int strToInt = Integer.parseInt(val);
			sum += strToInt;
		}

		return sum;
	}

}
