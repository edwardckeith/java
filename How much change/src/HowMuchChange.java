import textio.TextIO;

public class HowMuchChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, how many quarters do you have?");
		int quarters = TextIO.getlnInt();
		
		System.out.println("How many dimes do you have good sir?");
		int dimes = TextIO.getlnInt();
		
		
		System.out.println("How many nickels do you have good sir?");
		int nickels = TextIO.getlnInt();
		
		System.out.println("How many pennies do you have good sir?");
		int pennies = TextIO.getlnInt();
		
		
		double totalq;
		double totald;
		double totaln;
		double totalp;
		
		totalq= quarters*.25;
		totald= dimes*.10;
		totaln = nickels*.05;
		totalp = pennies*.01;
		
		double dollars;
		
		dollars = totalq + totald + totaln + totalp;
		
		TextIO.writeStandardOutput();
		TextIO.putf("You have $%1.2f", dollars);
		
		
		
		
	}

}
