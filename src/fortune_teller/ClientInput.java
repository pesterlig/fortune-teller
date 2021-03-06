package fortune_teller;

import java.text.NumberFormat;
import java.util.Scanner;

public class ClientInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.println("Welcome to Madame Sosostris' Psychic Hub!");
		System.out.println("To git yer fortune, enter your FIRST name: ");
		String firstName = input.nextLine();
		checkForQuit(firstName);
		System.out.println("Enter your LAST name: ");
		String lastName = input.nextLine();
		checkForQuit(lastName);

		System.out.println("Please enter your current temporal age in years: ");
		String ageStr = input.nextLine();
		checkForQuit(ageStr);
		int age = Integer.parseInt(ageStr);
		int yearsToRetirement;
		if (age % 2 == 0) {
			yearsToRetirement = 35;
		} else {
			yearsToRetirement = 5;
		}

		System.out.println("Please enter your birth month as an integer: ");
		String birthStr = input.nextLine();
		checkForQuit(birthStr);
		int birthMonth = Integer.parseInt(birthStr);
		double bankBalance;

		switch (birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
			bankBalance = 1375411.92;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			bankBalance = 58999900;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			bankBalance = 47000000.09;
			break;
		default:
			bankBalance = 0.00;
		}

		System.out.println("WHAT is your favorite ROYGBIV color \n" + "from the spectrum of visible light "
				+ "resplendently reflected by my sacred crystal? ");
		System.out.println("(If you need help with ROYGBIV, type Help instead!) ");
		String favoriteColor = (input.nextLine()).toLowerCase();
		checkForQuit(favoriteColor);
		String vehicle;

		// Help

		while (favoriteColor.contains("help")) {
			System.out.println("R = red");
			System.out.println("O = orange");
			System.out.println("Y = yellow");
			System.out.println("G = green");
			System.out.println("B = blue");
			System.out.println("I = indigo");
			System.out.println("V = violet");
			System.out.println(" ");
			System.out.println("WHAT is your favorite ROYGBIV color?");
			favoriteColor = input.nextLine().toLowerCase();
		}

		if (favoriteColor.contains("red")) {
			vehicle = "little red corvette";
		} else if (favoriteColor.contains("orange")) {
			vehicle = "pumpkin carriage";
		} else if (favoriteColor.contains("yellow")) {
			vehicle = "bat mobile";
		} else if (favoriteColor.contains("green")) {
			vehicle = "Nissan Leaf";
		} else if (favoriteColor.contains("blue")) {
			vehicle = "Secret Service jet";
		} else if (favoriteColor.contains("indigo")) {
			vehicle = "astral projection";
		} else if (favoriteColor.contains("violet")) {
			vehicle = "magic carpet";
		} else {
			vehicle = "walking everywhere, obstinately";
		}

		System.out.println("Enter the number of souls (siblings) who share your earthly parents:  ");
		String siblingStr = input.nextLine();
		checkForQuit(siblingStr);
		int numberSiblings = Integer.parseInt(siblingStr);
		String location;
		System.out.println(" ");
		if (numberSiblings == 0) {
			location = "a Buddhist monastery";
		} else if (numberSiblings == 1) {
			location = "a houseboat in Key West";
		} else if (numberSiblings == 2) {
			location = "a castle in the sky";
		} else if (numberSiblings == 3) {
			location = "Happy Hoosier Retirement Village";
		} else if (numberSiblings > 3) {
			location = "Paris, Ohio";
		} else {
			location = "a Martian colony with a food shortage";
		}

		// Display Fortune

		System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with "
				+ formatter.format(bankBalance) + " in the bank, live in a vacation home in " + location
				+ ", and travel by " + vehicle + ". ");
	}

	// Stretch 1 - checkForQuit Method

	public static void checkForQuit(String userInput) {
		if (userInput.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

	}
}
