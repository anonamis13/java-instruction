import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome\n");
		Scanner sc = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter birth year: ");
		int birthYear = sc.nextInt();
		
		//do business logic
		String fullName = firstName + " " + lastName;
		System.out.println("\nWelcome " + fullName + "!\nYour registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);
		
		sc.close();
		System.out.println("\nBye");

	}

}
