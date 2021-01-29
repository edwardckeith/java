/**
 * 
 * @author Edward Keith and Jessica Godi
 * Description:Write a program that tells you how many months it 
 * will take you to pay off the loan, as well as the total amount
 *  of interest paid over the life of the loan. Use a loop to calculate 
 *  the amount of interest and the size of the debt after each month. 
 *  (Your final program need not output the monthly amount of 
 * interest paid and remaining debt, but you may want to write a 
 * preliminary version of the program that does output these values.)
 *
 */
import textio.TextIO;	//Use <textio> so you can access the user's input.

public class InterestCalc 
{
	static double getInt, getMonth=0;	//Use static double so you can access the total interest and total months.
	
	
	public static void main(String[] args)	//Use the main method.
	{
		
		TextIO.put("How much is your loan amount?");	//Use <TextIO.put> to request how much their loan amount is.
		double loanAmount= TextIO.getlnDouble();	//Use <TextIO.getlnDouble()> to receive a total loan amount and to declare the variable.
		TextIO.put("How much do you want to pay each month?");	//Use <TextIO.put> to request how much they'd like to pay each month.
		double payplan= TextIO.getlnDouble();	//Use <TextIO.getlnDouble()> to receive a payment plan amount to declare the variable.
		TextIO.put("What is the annual interest rate?");	//Use <TextIO.put> to request how much the annual interest is.
		double anRate= TextIO.getlnDouble()/100;	//Use <TextIO.getlnDouble()> to receive an annual interest amount. Calculate as a decimal. Also declare as variable.
		getCalculations(loanAmount, payplan, anRate);	//Use <getCalculations> to call to the other method and receive variables calculated there.
		TextIO.put("It will take you "+getMonth+" months. You will pay $"+ getInt +" of interest.");	//Use <TextIO.put> to print the necessary results of the calculation.
	}
	static void getCalculations( double loanAmount, double payplan, double anRate)	//Create a different method using total loan amount, payment plan, and annual interest rate.
	{
		double mnRate;	//Declare the monthly rate as a variable.
		mnRate=anRate/12;	//Convert the annual rate to monthly rate.
		getInt=0;	//Set the starting total interest accumulation to zero.
		
		for(getMonth=0; loanAmount>=0; getMonth++)	//Use a for loop to track accumulated debt, total months, and interest rate.
		{
			double monthInt= loanAmount*mnRate;	//Calculate the monthly interest amount.
			double princpay= payplan-monthInt;	//Calculate the amount of interest paid.
			loanAmount=loanAmount-princpay;	//Calculate the remaining amount of debt.
			getInt=getInt+monthInt;	//Get total interest paid each month and add it on.
		}
	}

}
