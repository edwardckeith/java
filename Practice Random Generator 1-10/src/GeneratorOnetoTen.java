
public class GeneratorOnetoTen 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  int x,y; 
	        do {
	            x = (int)(10*Math.random() + 1);
	            y = (int)(10*Math.random() + 1);
	        } while (x == y);  
	        System.out.println(x + " " + y);
	}
}

