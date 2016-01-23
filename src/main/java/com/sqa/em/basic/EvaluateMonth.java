/**
 * File Name: SelectMonth.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.em.basic;

import java.util.Scanner;

/**
 * SelectMonth //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// NOTE: you did not had to convert it to a string and can just search
		// for the strings which will not include the catch
		// Declare variables
		// setting to keyboard input
		Scanner scanner = new Scanner(System.in);
		String input;
		// Asking the user to enter a month by entering the numbers 1-12 and
		// storing it.
		System.out.print("Please enter a number 1-12 so that the month referencing that number");
		input = scanner.nextLine();
		try {
			// convert the string to a number
			int inputPareToString = Integer.parseInt(input);
			// switch statement to find the month
			switch (inputPareToString) {
			case 1:
				System.out.println("\nJanuary");
				break;
			case 2:
				System.out.println("\nFebruary");
				break;
			case 3:
				System.out.println("\nMarch");
				break;
			case 4:
				System.out.println("\nApril");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("Octover");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("The number '" + inputPareToString + "'you enter is not withing the range 1-12");
				break;
			}
		} catch (Exception e) {
			System.out.println("Your input was '" + input + "' which is not a valid number.");
		}
		System.out.println("Good Bye!");
		scanner.close();
		System.exit(0);
	}
}
