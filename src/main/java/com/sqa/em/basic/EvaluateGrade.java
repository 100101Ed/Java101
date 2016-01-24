/**
 * File Name: SelectGrade.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.em.basic;

import java.util.Scanner;

/**
 * SelectGrade //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class EvaluateGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// gets a grade number and prints out the grade letter
		// initializer
		int gradeValue;
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a whole numbers 1-100 to obtained the respective grade");
		try {
			// get input
			input = scanner.nextLine();
			// parse string input to integer
			gradeValue = Integer.parseInt(input);
			// Printing the letter grade based on the number entered.
			System.out.print("\nThe number enter is '" + gradeValue + "' and your gread = ");
			if (gradeValue >= 90) {
				System.out.println("A");
			} else if (gradeValue >= 80) {
				System.out.println("B");
			} else if (gradeValue >= 70) {
				System.out.println("C");
			} else if (gradeValue >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} catch (NumberFormatException e) {
			System.out.println("You did not entered a number");
		}
		scanner.close();
		System.exit(0);
	}
}
