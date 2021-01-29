import textio.TextIO;

public class quadForm 
{

	public static void main(String[] args) 
	{
		double a, b, c;
		double Solution;
		boolean goAgain;
		
		System.out.println("This program will print a solution of an equation.");
		System.out.println("of the form A*X*X+B*X+C=0");
		System.out.println("are values that you enter.");
		
		do
		{
			System.out.println();
			System.out.println("Enter the values for A, B, and C:");
			System.out.print("A= ");
			a= TextIO.getlnDouble();
			System.out.print("B= ");
			b= TextIO.getlnDouble();
			System.out.print("C= ");
			c= TextIO.getlnDouble();
			
			try {
				Solution= root(a,b,c);
				System.out.println("A solution of the equation is " + Solution);
			}
			catch(IllegalArgumentException e) {
				System.out.println("Sorry, I can not find a solution.");
				System.out.println(e.getMessage());
			}
			System.out.println();
			System.out.print("Do you want to solve another equation? ");
			goAgain=TextIO.getlnBoolean();
			
		}while(goAgain);

	}
		static public double root(double a, double b, double c) throws IllegalArgumentException
		{					
			if(a==0) {
						throw new IllegalArgumentException("A can't be zero.");
					}
					else {
						double disc = b*b-4*a*c;
						if (disc <0) {
							throw new IllegalArgumentException("discriminant<0");
						}
						return (-b+ Math.sqrt(disc)) / (2*a);
					}
				}
}


