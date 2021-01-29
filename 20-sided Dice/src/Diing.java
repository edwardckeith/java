
public class Diing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice1, dice2, counter;
		counter = 0;
		do 
		
		{
		
		dice1 = (int)(Math.random() * 20) + 1;
		dice2 = (int)(Math.random() * 20) + 1;
		
		counter++;
		
		}
		while(dice1!= dice2);
		
		
		System.out.print(counter);
		System.out.print( "The dice rolled" + counter + "times before matching with the other dice.");
		System.out.print(dice1);
	} 

}
