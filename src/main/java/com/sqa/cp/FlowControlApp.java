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
	 * This method prints the name ofmonth using switch statement given a number
	 * from a user
	 */
	private static void determineMonthBasedOnInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the month : ");
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
			System.out.println("Horry!!");
			break;
		}
	}

	/**
	 * This method asks user for grade value and prints the associated grade
	 * letter
	 */
	private static void evalGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Grades you have :");
		String noOfGrade = scanner.nextLine();
		int total = 0, grade;
		for (int i = 1; i <= Integer.parseInt(noOfGrade); i++) {
			System.out.println("Please enter subject " + i + " marks :");
			String subject = scanner.nextLine();
			total = total + Integer.parseInt(subject);
		}
		grade = total / Integer.parseInt(noOfGrade);
		if (grade >= 90 && grade <= 100) {
			System.out.println("You got " + grade + "A .");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("You got " + grade + "B .");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("You got " + grade + "C .");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("You got " + grade + "D .");
		} else
			System.out.println("You got " + grade + "F .");
	}

	/**
	 * This method takes integer parameter and print the message on screen that
	 * "Number is grater than 10" otherwise it should print the message on
	 * screen that "Number is grater than 10" and else prints "Number is equal
	 * to 10"
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to evaluate against 10");
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
