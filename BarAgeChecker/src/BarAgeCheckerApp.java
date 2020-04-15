//v2.4 -- Spelling corrections


import java.util.Scanner;

public class BarAgeCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		Double Total = 0.0;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Java Happy Hour");
			System.out.println();

// Beginning of drink logic 
			System.out.println("Can I see your ID");
			System.out.println();
			System.out.print("Enter your Age: ");
			int age = sc.nextInt();
			System.out.println();

			if (age < 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				//Beginning of drink variables 
				
				
				
				while (!menuChoice.equalsIgnoreCase("X")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - Root Beer\n" +
							  "G - Ginger ale\n" +
							  "J - Juice\n"+
							  "RB - Redbull\n"+
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					
					

					case "W":
						System.out.println("Water Please\n");
						int test = 1;
						double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Please\n");
						double menuR  = 1.50;
						Total = Total + menuR;
						break;
					case "G":
						System.out.println("Ginger ale Please");
						double menuG  = 1.50;
						System.out.println();
						break;
					case "J":
						System.out.println("Juice Please");
						double menuJ  = 2.00;
						System.out.println();
						break;
					case "RB":
						System.out.println("Redbull Please");
						double menuRB  = 3.00;
						System.out.println();
						break;
					
					default:
						System.out.println("Invalid Choice, try again.");
						System.out.println();
						break;
					case "X":
						System.out.println("Thank you, come again");
						System.out.println();
						break;
						
					// end switch menu
					}
					System.out.println("Total Bill: " + Total);
				}
					// end while
				

			} else if (age >= 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				while (!menuChoice.equalsIgnoreCase("x")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - Root Beer\n" +
							  "G - Ginger ale\n" +
							  "B - Beer\n" +
							  "M - Martini\n" +
							  "T - Gin & Tonic\n" +
							  "O - Old Fashioned\n"+
							  "J - Juice\n"+
							  "RB - Redbull\n"+
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					case "W":
						System.out.println("Water Please");
						double menuW  = 0.00;
						System.out.println();
						break;

					case "R":
						System.out.println("Root beer Pleae");
						double menuR  = 1.50;
						System.out.println();
						break;
					case "G":
						System.out.println("Ginger ale Please");
						double menuG  = 1.50;
						System.out.println();
						break;
					

					case "B":
						System.out.println("Beer Please");
						double menuB  = 6.00;

						System.out.println();
						break;

					case "M":
						System.out.println("Martini Please");
						double menuM  = 7.50;
						System.out.println();
						break;

					case "T":
						System.out.println("Gin & Tonic Please");
						double menuT  = 8.00;
						System.out.println();
						break;
					case "O":
						System.out.println("Old Fashioned Please");
						double menuO  = 6.50;
						System.out.println();
						break;
					case "J":
						System.out.println("Juice Please");
						double menuJ  = 2.00;
						System.out.println();
						break;
					case "RB":
						System.out.println("Redbull Please");
						double menuRB  = 3.00;
						System.out.println();
						break;
					
					case "X":
						System.out.println("Thank you, come again ");
						System.out.println();
						break;
					default:
						System.out.println("Invalid Choice, try again.");
						System.out.println();
						break;
					// end switch menu
					}
					// end while
				}
			} // Possible spot for additional logic to calculate drink tab 
			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank You for using Bar Age Checker");
		sc.close();
	}
	
}

