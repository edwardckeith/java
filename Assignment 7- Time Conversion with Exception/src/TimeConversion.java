/**
 * 
 * @author Edward Keith and Nicholas Myers
 *			Write a program that converts a time from 24-hour notation to 12-hour notation. 
 *			
 *			Define an exception class called TimeFormatException. 
 *			If the user enters an illegal time, like 10:65, or even gibberish, like 8&*68, 
 *			your program should throw and handle a TimeFormatException.
 *			Make sure that the program correctly handles 00:00 and 12:00 and converts them to 
 *			12:00 am and 12:00 pm. Missing these times are a common mistake.
 */
import textio.TextIO;

public class TimeConversion 
{
public static int timeValue;
public static int first;
public static int second;
	public static void main(String[] args) 
	{
		boolean goAgain;
		
		
		System.out.println("This program will convert army time (24 hour time scale)"
							+ "to a standard 12 hour scale time");
		do
		{
			System.out.println();
			System.out.println("Please input a time you would like converted back to "
					+ "standard 12 hour scale time without the colon (I.e instead of 13:00 putting"
					+ "1300).");
		timeValue= TextIO.getlnInt();
		
		try 
		{
			String A=TimeFormatException();
			System.out.print(A);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("An illegal time was entered!");
		}           
			
			System.out.println();
			System.out.print("Do you want to convert another time?");
			goAgain=TextIO.getlnBoolean();
		}
		while(goAgain);

	}
	
	static public String convert ()
	{

		if (first>12)
		{
			first-=12;
			return (first+ ":"+second+"pm");
					
		}
		else if (first==00)
		{
			first=12;
			return(first+":0"+second+"am");
		}
		else
		{
			if(second<10)
				return (first+":0"+second+"am");
			else
				return (first+":"+second+"am");
		}
		
	}
	static public String TimeFormatException() throws IllegalArgumentException
	{
		first= timeValue/100;
		second= timeValue%100;
		
		if(second>=60)
		{
			throw new IllegalArgumentException("The second half of your time can"
												+ "not be equal to or greater than 60");
		}
		if(first>=24)
		{
			throw new IllegalArgumentException("The first half of your time can"
												+ "not be greater than or equal to 24");
		}
		return convert();
	}
	
}
