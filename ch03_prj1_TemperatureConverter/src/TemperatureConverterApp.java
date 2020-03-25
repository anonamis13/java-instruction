import java.util.Scanner;
import java.math.BigDecimal;

public class TemperatureConverterApp {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Welcome to the Temperature Converter");
		 String choice = "y";
		 
		 while (choice.equalsIgnoreCase("y")) {
			 double temp;
			 System.out.print("\nEnter degrees in Fahrenheit: ");
			 temp = sc.nextDouble();
			 double tempCels = (double)Math.round(((temp - 32)*5/9)*100)/100;
			 
			 System.out.println("Degrees in Celcius: " + tempCels);
			 
			 System.out.print("\nContinue? (y/n): ");
			 choice = sc.next();
		 }
		 
		 sc.close();
		 System.out.println("\nGoodbye");
	 }
}
