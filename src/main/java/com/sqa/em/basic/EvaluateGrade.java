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
		int numberForGrade;
		String gradeEnterByUser;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number 1-100 of the test score");
		try {
			gradeEnterByUser = scanner.nextLine();
			numberForGrade = Integer.parseInt(gradeEnterByUser);
			// Printing the letter based on the number entered.
			System.out.print("\nThe number enter is " + numberForGrade + " and your gread is an ");
			if (numberForGrade >= 90) {
				System.out.println("A");
			} else if (numberForGrade >= 80) {
				System.out.println("B");
			} else if (numberForGrade >= 70) {
				System.out.println("C");
			} else if (numberForGrade >= 60) {
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
