package ui;

import java.util.List;
import java.util.ArrayList;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game");
		String choice = "";
		String grabItem = "";
		int editItemIndex = 0;
		String editItemName = "";
		int dropItemIndex = 0;
		int enchantItemIndex = 0;
		int enchantment = 0;
		List<String> inventory = new ArrayList<>(3);
		List<String> enchantsList = new ArrayList<>(4);
		
		//initial inventory
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");
		
		//initial enchants
		enchantsList.add("SPE");
		enchantsList.add("STA");
		enchantsList.add("ATK");
		enchantsList.add("DEF");
		
		displayMenu();
		
		choice = Console.getString("\nCommand: ");
		
		while (!choice.equalsIgnoreCase("exit")) {
			if (choice.equalsIgnoreCase("show")) {
				for (int i = 0; i < inventory.size(); i++) {
					System.out.println(i+1 + ". " + inventory.get(i));
				}
			}
			else if (choice.equalsIgnoreCase("grab")) {
				if (inventory.size() < 4) {
					grabItem = Console.getString("Name: ");
					inventory.add(grabItem);
					System.out.println(grabItem + " was added.");
				}
				else {
					System.out.println("You can't carry any more items. Drop something first.");
				}
			}
			else if (choice.equalsIgnoreCase("edit")) {
				editItemIndex = Console.getInt("Number: ", 0, inventory.size()+1);
				editItemName = Console.getString("Updated name: ");
				inventory.set(editItemIndex-1, editItemName);
				System.out.println("Item number " + (editItemIndex) + " was updated.");
			}
			else if (choice.equalsIgnoreCase("drop")) {
				dropItemIndex = Console.getInt("Number: ", 0, inventory.size()+1);
				System.out.println(inventory.get((dropItemIndex)-1) + " was dropped.");
				inventory.remove(dropItemIndex-1);
			}
			else if (choice.equalsIgnoreCase("enchant")) {
				enchantItemIndex = Console.getInt("Number: ", 0, inventory.size()+1);
				enchantment = Console.getInt("Select enchantment:\n" +
												"	1. Speed\n" +
												"	2. Stamina\n" +
												"	3. Attack\n" +
												"	4. Defense\n\n" +
												"I choose: ", 0, 5);
				System.out.println(inventory.get(enchantItemIndex-1) + " upgraded to " +
												"(+" + 1 + " " + enchantsList.get(enchantment-1) + ") " 
												+ inventory.get(enchantItemIndex-1));
				inventory.set(enchantItemIndex-1, "(+" + 1 + " " + enchantsList.get(enchantment-1) + ") " 
												+ inventory.get(enchantItemIndex-1));
			}
			else if (choice.equalsIgnoreCase("help")) {
				displayMenu();
			}
			else {
				System.out.println("Command not recognized, please try again.");
			}
			choice = Console.getString("\nCommand: ");
		}
		
		
		System.out.println("\nGoodbye");

	}

	private static void displayMenu() {
		System.out.println("\nCOMMAND MENU\n" +
							"show    - Show all items\n" +
							"grab    - Grab an item\n" +
							"edit    - Edit an item\n" +
							"drop    - Drop an item\n" +
							"enchant - Enchant an item\n" +
							"exit    - Exit program\n" +
							"help    - Show command menu");
	}

}