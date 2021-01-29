/**
 * AUTHOR: Edward C. Keith
 * CLASS: Information Science and Technology 1561
 * TASK: The program will ask the user to enter in
 * the number of sides on the die they would like
 * to roll, as well as the number of times they would
 * like to roll the dice during the run of the program.
 */
import textio.TextIO;	//Use <textio> file which allows users to input information.

public class DiceRoller {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		int result, counter;	//Assign a name for your variables: result and counter variable.
		counter = 0;	//Set counter to zero as its starting point.

		TextIO.put("How many sides would you like your dice to have?");	//Use <TextIO.put> to ask the user how many sides they would like.
		int die_size = TextIO.getlnInt();	//Use int <variable name> to assign the dice the number of sides the user wants.
		TextIO.put("How many times would you like to roll it?");	//Use <TextIO.put> to ask the user the number of times they want to roll.
		int times= TextIO.getInt();	//Use int <variable name> to assign the number of times you want it rolled.
		
		do {	//Set up a do-while loop to make the computer repeat the program till it rolls the users number of times.
			
			result= (int)(Math.random() * die_size) + 1; //Use <Math.random()> to set the dice range from 1-<number of sides the user wants>.
			counter++;	//Use <counter++> to increment counter.
			System.out.println("You rolled a " + die_size + " sided dice. ");	//Print the result of the individual rolls.
			System.out.println("Your result is "+ result + ".");	//Print the result of the individual rolls.
			}
		while(counter!=times); //End the do-while loop with <counter!=times> to terminate the loop after the amount of times the user wanted were reached.
		
	
		System.out.println(times + " being the number of times you rolled."); //Print something to indicate to the user that their desired task was completed.
	}
}
