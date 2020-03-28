import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter first number: ");
			int first = sc.nextInt();
			System.out.print("Enter second number: ");
			int second = sc.nextInt();
			
			while (second != 0) {
				while (first >= second) {
					first = first - second;
				}
				int temp = first;
				first = second;
				second = temp;
			}
			System.out.println("Greatest common divisor: " + first);
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("\nGoodbye");
	}

}
