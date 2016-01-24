/**
 * File Name: PrintEvenNumOneToHundred.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.em.basic;

/**
 * PrintEvenNumOneToHundred //Write a java program which prints all even numbers
 * from 1 to 100. Use Java loops. Use % operator to check if a number is even or
 * not.
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class PrintEvenNumOneToHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int mod = i % 2;
			if (mod == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
