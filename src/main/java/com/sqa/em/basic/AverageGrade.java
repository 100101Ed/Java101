/**
 * File Name: GradeResults.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.em.basic;

import java.util.Scanner;

/**
 * GradeResults //Write a java program which prints the grade average of given
 * user based on a user supplied set of grade values. Repeat execution until
 * user has no more item to add to grade. Use Java loops Use + operator to add
 * numbers
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class AverageGrade {

	public static String getLetterGrade(int gradeValue) {
		if (gradeValue >= 90) {
			return "A";
		} else if (gradeValue >= 80) {
			return "B";
		} else if (gradeValue >= 70) {
			return "C";
		} else if (gradeValue >= 60) {
			return "D";
		} else {
			return "F";
		}
		// return "Number is not within range";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		Scanner scanner = new Scanner(System.in);
		String inputFromUser = "";
		int gradeNum = 0;
		int countOfGradesEnter = 0;
		double sumOfGradesTotal = 0;
		System.out.println("Enter a whole number 0-100 representing a grade for your student.\n"
				+ "\tIf you have more than one grade for a student select <Enter> and type the next grade number.\n"
				+ "\tRepeat the above instructions until all grades have been entered.\n"
				+ "\tWhen you don't have any more grades type anything else than a number from 0-100.\n");
		do {
			inputFromUser = scanner.nextLine();
			try {
				gradeNum = Integer.parseInt(inputFromUser);
				if ((gradeNum <= 100) && (gradeNum >= 0)) {
					sumOfGradesTotal += gradeNum;
					countOfGradesEnter++;
				} else {
					inputFromUser = "Exit";
				}
			} catch (NumberFormatException e) {
				System.out.println("Grade enter is not a number");
				inputFromUser = "Exit";
			}
		} while (inputFromUser != "Exit");
		// Print results
		if (countOfGradesEnter != 0) {
			System.out.print("\n\nYour results are" + "\n\tTotal entries '" + countOfGradesEnter + "'\n\tSum '"
					+ sumOfGradesTotal + "'\n\tFinal Grade '" + getLetterGrade(gradeNum / countOfGradesEnter) + "'");
		}
		System.out.println("\n No more gradesGood Bye!");
		// Close
		scanner.close();
	}
}
