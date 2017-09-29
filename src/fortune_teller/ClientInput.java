package fortune_teller;

import java.util.Scanner;

public class ClientInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String favoriteColor;
		int numberSiblings;

		System.out.println("Welcome to Madame Sosostris' Psychic Hub!");
		System.out.println("To git yer fortune, enter the FIRST name "
				+ "chosen by your - soul for your physical incarnation in this plane: ");
		firstName = input.nextLine();
		System.out.println("And now, enter your LAST name: ");
		lastName = input.nextLine();

		System.out.println("Please enter your current temporal age in years: ");
		age = input.nextInt();

		System.out.println("Please enter your birth month as an integer: ");
		System.out.println("Example - If you were born in October, enter 10 ");
		birthMonth = input.nextInt();

		System.out.println("WHAT is your favorite ROYGBIV color \n" +
		"from the spectrum of visible light "
				+ "resplendently reflected by my sacred crystal? ");
		System.out.println("(If you need help with ROYGBIV, type Help instead!) ");
		favoriteColor = input.next();		
//		System.out.println(favoriteColor + " is Madame Sosostris' favorite color, too!");
		
		System.out.println("Enter the number of souls (siblings) who share your earthly parents:  ");
		numberSiblings = input.nextInt();
		System.out.println(" ");
		
		
	
		
		
	}

}
