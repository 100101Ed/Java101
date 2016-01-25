/**
 * File Name: EmployeeHours.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 24, 2016
 */
package com.sqa.em.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * EmployeeHours //Logs the hours of an employee for the week and determine
 * their employee status and display some statics for the hours.
 * <p>
 * //ADDD (description of core fields) The field values will be collected from
 * the user; Employee's name, Days works for that week, and Total Hours for each
 * day worked. With the information collected will calculate; Total hours worked
 * for that week, Average hours worked, Median hours worked
 * <p>
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 **/
public class EmployeeHours {

	static Scanner scanner = new Scanner(System.in);

	static String[] daysOfTheWeek = { "Monday", "Tueaday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	static double[] hoursWorkedForEachDay = new double[7];

	static String EmployeeName = "";

	static double averageHourWorked = 0.0;

	static double medium = 0.0;

	public static double actualDaysWorked = 0;

	public static double calculateAverage() {
		double sumOfNum = 0;
		for (double num : hoursWorkedForEachDay) {
			sumOfNum += num;
		}
		return (sumOfNum / actualDaysWorked);
	}

	public static double calculateMedian() {
		Arrays.sort(hoursWorkedForEachDay);
		int middle = (int) (actualDaysWorked / 2);
		if (middle != 0) {
			if ((actualDaysWorked % 2) != 0) {
				return hoursWorkedForEachDay[6 - middle];
			} else {
				return ((hoursWorkedForEachDay[6 - middle] / hoursWorkedForEachDay[6 - middle + 1]) / 2);
			}
		} else {
			return hoursWorkedForEachDay[7 - 1];
		}
	}

	// method to say farewell to user
	public static void exitApplication() {
		// Message to say farewell to user
		System.out.println("\nThank you for using the Application.\nHave a great week!");
		// Close the scanner
		scanner.close();
		// Exit the system
		System.exit(0);
	}

	/**
	 * @return name
	 */
	public static String getEmployeeNameFromUser() {
		String userInput = "";
		System.out.println("Can I get your employee's Name, please? ");
		userInput = scanner.nextLine();
		return userInput;
	}

	public static void getHoursWorkedForEachWorkDay() {
		String userInput = "";
		double hoursEnter = 0;
		System.out.println(
				"Now I need to collect hours for the week.\nHours are expected to be entered in the following format: "
						+ "\n\t0.5 which is 30 minutes" + "\n\t6.75 which is 6 hours and 45 minutes.)"
						+ "\n\tIf the empoyee did not work that day enter 0\n");
		for (int i = 0; i < daysOfTheWeek.length; i++) {
			System.out
					.println("Enter how many hours " + EmployeeName + " worked on " + daysOfTheWeek[i] + ", please? ");
			userInput = scanner.nextLine();
			try {
				hoursEnter = Double.parseDouble(userInput);
			} catch (NumberFormatException e) {
				System.out.println("Try again");
				hoursEnter = 1000;
			}
			while (hoursEnter < 0.0 || hoursEnter > 24.0) {
				System.out.println("Hours enter '" + userInput + "' are not in the expected format (0.30, 7.50..).\n"
						+ "Please try again, enter hours");
				userInput = scanner.nextLine();
				try {
					hoursEnter = Double.parseDouble(userInput);
				} catch (NumberFormatException e) {
					System.out.println("Try again");
					hoursEnter = 1000;
				}
			}
			hoursWorkedForEachDay[i] = hoursEnter;
			if (hoursEnter > 0.0) {
				actualDaysWorked++;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Hours Log Application\n\n");
		EmployeeName = getEmployeeNameFromUser();
		getHoursWorkedForEachWorkDay();
		averageHourWorked = calculateAverage();
		//medium = calculateMedian();  TODO: Need to create a Dynamic array for the Medium to work and then update the rest of the file
		printLog();
		exitApplication();
	}

	public static void printLog() {
		System.out.println("\n\n***************Log***************\n  Employee " + EmployeeName + "\nWorked "
				+ actualDaysWorked + " day(s) of the week\n" + "Average hours = " + averageHourWorked
				+ "\nMedium for the week = " + medium + "\n***************Log***************\n");
	}
}
