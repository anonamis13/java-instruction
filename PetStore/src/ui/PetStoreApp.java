package ui;

import java.util.List;
import java.util.ArrayList;
import biz.Pet;
import util.Console;

public class PetStoreApp {

	public static void main(String[] args) {
		
		//initialize variables
		String command = "";
		List<Pet> inventory = new ArrayList<>(2);
		
		//welcome
		System.out.println("Welcome to the Pet Store App!\n"
						+ "This application will manage a list of pets. You can add pets"
						+ "to the inventory, and remove them when they get adopted.");
		
		//initial inventory
		Pet p1 = new Pet(1, "Cat", "Tortie", "Marley", 5);
		Pet p2 = new Pet(2, "Dog", "Collie", "Rusty", 8);
		inventory.add(p1);
		inventory.add(p2);
		
		//display menu method
		commandMenu();
		
		//prompt input, begin logic
		command = Console.getString("\nCommand: ", true);
		
		while (!command.equalsIgnoreCase("exit")) {
			if (command.equalsIgnoreCase("list")) {
				System.out.println("\nPet Inventory\n"
								+ "-------------");
				listPet(inventory);
			}
			else if (command.equalsIgnoreCase("add")) {
				System.out.println("\nAdd a Pet\n"
								+ "----------");
				addPet(inventory);
			}
			else if (command.equalsIgnoreCase("adopt")) {
				System.out.println("\nPet Adoption\n"
								+ "--------------");
				adoptPet(inventory);
			}
			else if (command.equalsIgnoreCase("help")) {
				commandMenu();
			}
			else {
				System.out.println("Command not recognized, please try again.");
			}
			command = Console.getString("\nCommand: ");
		}
		
		//goodbye
		System.out.println("\nBye!");
	}
	
	public static void commandMenu() {
		System.out.println("\nCommand Menu:\n"
						+ "==============\n"
						+ "-list - list all pets\n"
						+ "-add - add pet to inventory\n"
						+ "-adopt - remove adopted pet from inventory\n"
						+ "-help - display command menu again\n"
						+ "-exit - exit the application");
	}
	
	public static void listPet(List<Pet> inventory) {
		for (Pet p : inventory) {
			System.out.println(p);
		}
	}
	
	public static void addPet(List<Pet> inventory) {
		//prompt pet fields
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		String type = Console.getString("Type? ", true);
		String species = Console.getString("Species? ", true);
		String name = Console.getString("Name? ", true);
		int age = Console.getInt("Age? ", -1, Integer.MAX_VALUE);
		
		Pet p = new Pet(id, type, species, name, age);
		if (inventory.add(p)) {
			System.out.println("\nPet successfully added");
		}
		else {
			System.out.println("\nIssue adding pet. Please try again.");
		}
	}
	
	public static void adoptPet(List<Pet> inventory) {
		int id = Console.getInt("Id of pet to adopt? ", 0, inventory.size()+1);
		for (Pet p : inventory) {
			if (id-1 == p.getId()) {
				inventory.remove(id-1);
			}
		}
		
	}

}
