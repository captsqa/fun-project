/**
 * File Name: AppBasics.java<br>
 * Chhaya Patel<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.cp.helpers;

import java.util.Scanner;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chhaya Patel
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank you and wish them well
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println(
				"\nThank you " + name + ", for using Basic App " + appName + "Application.\nHave a great Day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the application.
	 * This method then takes their name and returns
	 *
	 * @param appName
	 *            Name of Application
	 * @return name Name of user
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}

	/**
	 * @param string
	 *            Ask user a Question
	 * @param int
	 *            minimum range
	 * @param int
	 *            maximum range
	 * @return
	 */
	public static int requestInt(String question, int min, int max) {
		int resultNumber = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// Ask Question
				System.out.print(question + " ");
				// Get Input String from user
				input = scanner.nextLine();
				// Parse input string into int type
				resultNumber = Integer.parseInt(input);
				// Evaluate valid entry
				// Evaluate valid range
				if (resultNumber >= min && resultNumber <= max) {
					valid = true;
				} else {
					System.out.println("Please Enter number between " + min + " and " + max);
				}
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid formatted number [" + input + "]");
			}
		}
		return resultNumber;
	}
}
