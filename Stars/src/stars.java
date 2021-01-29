/**
 * 
 * @author Write a subroutine named "stars" that will output a line of stars to standard output. 
 * (A star is the character "*".) The number of stars should be given as a parameter to the subroutine. 
 * Use a for loop. For example, the command "stars(20)" would output
 	********************
 *
 */

public class stars 
{

	static void stars(int StarNumber) 
	{
		for(int s=0;s<StarNumber;s++)
		{
			System.out.println("*");
		}
		
	}
	public static void main(String args[])
	{
		for(int line=1;line<=10;line++)
		{
			stars(line);
		}
		
	}
}
