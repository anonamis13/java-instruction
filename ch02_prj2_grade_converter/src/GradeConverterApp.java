import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter numerical grade: ");
			int numericGrade = sc.nextInt();
			String letterGrade = "";
			
			if (numericGrade >= 88) {
				letterGrade = "A";
			} else if (numericGrade >= 80){
				letterGrade = "B";
			} else if (numericGrade >= 67){
				letterGrade = "C";
			} else if (numericGrade >= 60){
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
			
			System.out.println("Letter grade: " + letterGrade);
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("\nBye");
	}

}
