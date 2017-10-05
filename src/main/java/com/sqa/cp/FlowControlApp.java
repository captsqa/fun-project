/**
 * File Name: FlowControlApp.java<br>
 * Chhaya Patel<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.cp;

import java.util.Scanner;

import com.sqa.cp.helpers.AppBasics;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chhaya Patel
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	private static String appName = "Flow Control App";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * This method prints the name of month using switch statement given a
	 * number from a user
	 */
	private static void determineMonthBasedOnInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease enter the month : ");
		String input = scanner.nextLine();
		switch (Integer.parseInt(input)) {
		case 1:
			System.out.println("Its January");
			break;
		case 2:
			System.out.println("Its February");
			break;
		case 3:
			System.out.println("Its March");
			break;
		case 4:
			System.out.println("Its April");
			break;
		case 5:
			System.out.println("Its May");
			break;
		case 6:
			System.out.println("Its June");
			break;
		case 7:
			System.out.println("Its July");
			break;
		case 8:
			System.out.println("Its August");
			break;
		case 9:
			System.out.println("Its September");
			break;
		case 10:
			System.out.println("Its October");
			break;
		case 11:
			System.out.println("Its November");
			break;
		case 12:
			System.out.println("Its December");
			break;
		default:
			System.out.println("Plese enter number from 1-12");
			break;
		}
	}

	/**
	 * This method asks user for grade value and prints the associated grade
	 * letter
	 */
	private static void evalGrade() {
		Scanner scanner = new Scanner(System.in);
		int total = 0, gradeInt = 0;
		System.out.println("\n\nPlease enter subject score (out of 100):");
		String grade = scanner.nextLine();
		gradeInt = Integer.parseInt(grade);
		if (gradeInt >= 90 && gradeInt <= 100) {
			System.out.println("You got " + gradeInt + "which is A .");
		} else if (gradeInt >= 80 && gradeInt <= 89) {
			System.out.println("You got " + gradeInt + "which is B .");
		} else if (gradeInt >= 70 && gradeInt <= 79) {
			System.out.println("You got " + gradeInt + "which is C .");
		} else if (gradeInt >= 60 && gradeInt <= 69) {
			System.out.println("You got " + gradeInt + "which is D .");
		} else
			System.out.println("You got " + gradeInt + " which is F .");
	}

	/**
	 * This method takes integer parameter and print the message on screen that
	 * "Number is grater than 10" otherwise it should print the message on
	 * screen that "Number is grater than 10" and else prints "Number is equal
	 * to 10"
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease enter a number to evaluate against 10");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number > 10) {
			System.out.println("Number " + number + " is grater than 10");
		} else if (number < 10) {
			System.out.println("Number " + number + " is less than 10");
		} else {
			System.out.println("Number " + number + " is equal to 10");
		}
	}
}
