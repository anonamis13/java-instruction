import java.util.Scanner;
import java.lang.Math;;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller game\n");
		Scanner sc = new Scanner(System.in);
		
		
		if (rollChoice(sc).equalsIgnoreCase("y")) {
			
			rollDice();
			
			while (rollAgainChoice(sc).equalsIgnoreCase("y")) {
				rollDice();
			}	
		}		
		
		System.out.println("\nGoodbye");
		sc.close();
	}
	
	private static String rollChoice(Scanner sc) {
		System.out.print("Roll the Dice? (y/n): ");
		String choice = sc.next();
		
		while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
			System.out.print("Invalid choice. Try again: ");
			choice = sc.next();
		}
		
		return choice;
	}
	
	private static String rollAgainChoice(Scanner sc) {
		System.out.print("\nRoll again? (y/n): ");
		String choice = sc.next();
		
		while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
			System.out.print("Invalid choice. Try again: ");
			choice = sc.next();
		}
		
		return choice;
	}
	
	private static void rollDice() {
		int die1 = (int)(Math.random() * 6) + 1;
		int die2 = (int)(Math.random() * 6) + 1;
		int total = die1 + die2;
		
		System.out.println("\nDie 1: " + die1 + "\nDie 2: " + die2 + "\nTotal: " + total);
		
		if (total == 2) {
			System.out.println("Snake Eyes!");
		}
		else if (total == 12) {
			System.out.println("Boxcars!");
		}
	}

}
