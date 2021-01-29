/**
 * 
 * @author Edward Keith & Jessica Godi
 * 
 * A common memory matching game played by young children is to start with a deck of cards that contain identical pairs. 
 * For example, given six cards in the deck, two might be labeled 1, two labeled 2, and two labeled 3. 
 * The cards are shuffled and placed face down on the table. A player then selects two cards that are face down, turns them face up, 
 * and if the cards match, they are left face up. If the two cards do not match, they are returned to their original face down position. 
 * The game continues until all cards are face up.
 *
 *Write a program that plays the memory matching game. Use 16 cards that are laid out in a 4 × 4 square and are labeled with pairs of numbers from 1 to 8. 
 *Your program should allow the player to specify the cards that he or she would like to select through a coordinate system.
 *
 *all of the face down cards are indicated by *. The pairs of 8 that are face up are at coordinates (1,1) and (2,3). 
 *To hide the cards that have been temporarily placed face up, output a large number of newlines to force the old board off the screen.
 *
 *Hint: Use a 2D array for the arrangement of cards and another 2D array that indicates if a card is face up or face down. 
 *Or, a more elegant solution is to create a single 2D array where each element is an object that stores both the card’s value and face. 
 *Write a function that “shuffles” the cards in the array by repeatedly selecting two cards at random and swapping them.
 */
import java.util.ArrayList; // Import 2D array
import textio.TextIO; // Import TextIo

public class MemoryMain 
{

	public static void main(String[] args) 
	{
		boolean gameOver=false; // Create boolean game over and set it to false so the while loop at line 60 ends when game over is true
		String [][] faceD=  // Create the face down 2D array
			{
					{"*","*","*","*"},
					{"*","*","*","*"},
					{"*","*","*","*"},
					{"*","*","*","*"},
			};
		System.out.println(); // Print a line for aesthetics
		
		ArrayList<Integer> valueList=  new ArrayList<Integer>(); // Create a 1D array named valuelist
		
		for(int g=1;g<9;g++) // Use a for loop to create a list of all possible numbers that are going to be used in the 2D array
		{
			valueList.add(g);
			valueList.add(g);
		}

		int [][] values= new int [4][4];
		 // Create a face up array using lines 47 to 57 the for loop creates a four by four 2d array while accessing line 47
		for(int i=0;i<4;i++) 
		{
			for(int j=0;j<4;j++)
			{
				int index=(int)(Math.random()*valueList.size());
				values[i][j]=valueList.get(index);
				valueList.remove(index);
			}
		}
	
	
	while(gameOver!=true) // Create a for loop so the game continues until gameOver is true
	{
		System.out.println(); // Print a line for aesthetics
		for(int i=0;i<4;i++) // Use a for loop to reprint the 2D array
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(faceD[i][j]);
			}
			System.out.println();
		}
		System.out.println(); // Print a line for aesthetics
			System.out.println("Goodluck sir.");
			System.out.println("MEMORY! Please find the matching numbers. Each time you pick non-matching numbers the "
					+ "cards will flip over. Hint: remember where the numbers are.");
			System.out.println("Pick an x-coordinate (1-4) of a star I should flip over.");
			int x1=TextIO.getlnInt();
			System.out.println("Pick an y-coordinate (1-4) of a star I should flip over.");
			int y1=TextIO.getlnInt();
			System.out.println("Pick an x-coordinate (1-4) of a star I should flip over.");
			int x2=TextIO.getlnInt();
			System.out.println("Pick an y-coordinate (1-4) of a star I should flip over.");
			int y2=TextIO.getlnInt();
			// Use TextIo to recive input from the user to get the coordinates they would like flipped
			int values1= values[y1-1][x1-1]; // Create a variable that access the first coordinate the user inputs. Switch y and x to account for how the computer reads
			int values2= values[y2-1][x2-1]; // Create a variable that access the first coordinate the user inputs. Switch y and x to account for how the computer reads
			
			faceD[y1-1][x1-1]=""+values1; // Access the face down array to reveal the coordinate the user inputed
			faceD[y2-1][x2-1]=""+values2;
			System.out.println(); // Print line for aesthetics
			for(int i=0;i<4;i++) // Use a for loop to reprint the face down 2D array
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(faceD[i][j]);
				}
				System.out.println();
			}
			
			if(values1!=values2) // Create an if statement so if the values do not match the coordinates the user inputed turn back to stars
			{
				faceD[y1-1][x1-1]="*";
				faceD[y2-1][x2-1]="*";
			}
			boolean O= true; // Create a dummy boolean variable that is equal to true so that when the for loop tests to see if there are any stars it can determin whether to continue or end the game
				for(int i=0;i<4;i++) // Use a for loop to evaluate whether there are any stars using the dummy variable
				{
					for(int j=0;j<4;j++)
					{
						if(faceD[i][j].equals("*"))
						{
							O=false;
						}
					}
				}
				gameOver=O; // Set gameOver equal to the dummy variable so the program know whether to continue or not
				if(gameOver==true) // Use an if statement to indicate to the user that they won using the gameOver variable
				{
					System.out.println("You won!");
				}
			
	}

	
	
}
}
