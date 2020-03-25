
public class MathClassApp {

	public static void main(String[] args) {
		// rounding - whole numbers
		long result = Math.round(1.667);
		int result1 = (int)Math.round(1.49);
		System.out.println(result);
		System.out.println(result1);
		
		//round a double to a specific number of decimals
		double x = 10.315;
		//round to 2 decimals
		double x1 = (double)Math.round(x * 100) / 100;
		System.out.println(x1);
		//round to 1 decimal
		double x2 = (double)Math.round(x * 10)  / 10;
		System.out.println(x2);

		
		//generate some random numbers
		double r1 = Math.random(); 
		System.out.println(r1);
		//dice roll
		int die1 = (int)(Math.random()*6)+1;
		System.out.println(die1);
		
		//min and max
		System.out.println(Math.max(7, 1));
		System.out.println(Math.min(36.78, 34.22));
	}

}
