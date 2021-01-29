import textio.TextIO; //Use <textio> file so user can input information

public class CrapsSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gameQty;    //assign a variable that represents quantity of games
		int win = 0;    //set a variable that represents games won
		int loss = 0;   //assign a variable that represents games loss
		int die;    //set a variable for your dice
		
		TextIO.put("How many games would you like to play? ");  //use <TextIO.put> to ask user how many games they would like
		gameQty = TextIO.getlnInt();    //use <TextIO.getlnInt();> to receive their response
		
		for (int i = 0; i < gameQty; i++) { //use a for loop so the amount of games the user desires is ran by the loop
			die = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);    //use <Math.random()> to where two 6-sided die can be rolled
		
		if (die == 7 || die == 11) {    //write an if statement so the user wins if 7 or 11 are rolled
			System.out.println("You won with a " + die + "!");  //print out an indicator that they won
			win = win + 1;  //add a win for the player
		}
		else if (die == 2 || die == 3|| die == 12) {    //use an else-if statement so the user loses if a 2, 3, or 12 is rolled initially
			System.out.println("You lost with a " + die + "."); //indicate to the user they loss by printing it
			loss = loss + 1;    //add a loss for the player
		}
		else {  //write an else statement for <point> conditions
			int point = die;    //indicate that if the number is not 7, 11, 2, 3, or 12, the dice is a <"point">
			System.out.println("The point is " + point);    //tell the user what the <"point"> is
			while (true) {  //make a while loop to roll and to indicate what is rolled concerning your point
				die = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);    //roll your die using <Math.random()>
				System.out.println("Your new roll is a " + die + ".");  //print your result of the die
				if (die == point) { //write and if statement that works while what you roll is equal to the <point>
					System.out.println("You rolled the point! You Won!");   //indicate to the user they won
					win = win + 1;  //add a win for the player
					break;  //break so this does not continue
				}
				if (die == 7) { //write an if statement for when 7 is rolled instead of the point
					System.out.println("You rolled a 7. You lost.");    //indicate to them that they loss
					loss = loss + 1;    //count their loss
					break;  //break so this loop does not continue
				}
			}
		}
		System.out.println();   //print space for visually pleasing formatting
	}
		int percentage = (win *100/ gameQty);   //calculate the win percentage
		System.out.println("\nThe number of wins is " + win + ", and number of losses is " + loss + ", and the probability of winning a game is " + percentage + "%" );    //indicate the results of the game to the user
	}


	
		int percentage = (win*100/ gameQty);
		System.out.println("\nThe number of wins is " + win + ", and number of losses is " + loss + ", and the probability of winning a game is " + percentage + "%" );
	

}
