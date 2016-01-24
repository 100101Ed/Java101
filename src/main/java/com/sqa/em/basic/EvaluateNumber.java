/**
 * File Name: EvaluateNumber.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.em.basic;

import java.util.Scanner;

/**
 * EvaluateNumber //Will evaluate a number and state where it lands within the
 * digit 10.
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //evaulateNumber Method will determine if the number is greater than , less
 * than or equal to 10
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateNumber {

	/**
	 * @param args
	 */
	// Method declaration
	// Evaluate the number if it is greater than 10 and display the appropriate
	// message
	public static void evaulateNumber(int num) {
		if (num > 10) {
			System.out.println("Your number '" + num + "' is greater than 10.");
		} else if (num < 10) {
			System.out.println("Your number '" + num + "' is less than 10.");
		} else if (num == 10) {
			System.out.println("Your number '" + num + "' is equal to 10.");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare the scanner object.
		Scanner scanner = new Scanner(System.in);
		// Ask the user to enter a number.
		System.out.println("You will enter 3 numbers to see if they are less, greater or equal to 10");
		for (int i = 0; i < 3; i++) {
			System.out.println("Please Enter your a number ");
			String userNumberString = scanner.nextLine();
			int userNumber = Integer.parseInt(userNumberString);
			// Invoke the method
			evaulateNumber(userNumber);
		}
		// close the scanner
		scanner.close();
		System.exit(0);
	}
}
