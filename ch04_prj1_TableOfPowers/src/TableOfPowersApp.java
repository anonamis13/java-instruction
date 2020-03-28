import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer: ");
			int num = sc.nextInt();
			
			System.out.println("\nNumber\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			
			for (int i = 1; i <= num; i++) {
				System.out.println(i + "\t" +
									i*i + "\t" +
									i*i*i + "\t");
			}
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("\nGoodbye");
	}

}
