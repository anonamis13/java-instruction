import java.text.NumberFormat;

public class FormatNumbersApp {

	public static void main(String[] args) {
		double carPrice = 35000.857;

		System.out.println("Car price is: " + carPrice);
		//format as currency
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted car price is: " + cf.format(carPrice));
		
		double interestRate = .03579;
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		System.out.println("Interest rate is: " + interestRate);
		System.out.println("Formatted interest rate is: " + pf.format(interestRate));
	}

}
