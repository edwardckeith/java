/**
 * Calculating hypotenuse, run time, pi, and run time in nano seconds
 * @author Edward C. Keith
 *
 */
public class NanoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double startTime = System.nanoTime();
		
		double w= 42;
		double h= 17;
		double Hypotenuse = Math.sqrt(w*w+h*h);
		System.out.println("Professor Oswald, the hypotenuse is:" + Hypotenuse);
		
		Math.random();
		System.out.println("Professor Oswald, the random number is:" + Math.random());
		
		System.out.println("Professor Oswald, PI is:" + Math.PI);
		
		
		double endTime = System.nanoTime();
		double compTime= (endTime-startTime);
		
		System.out.println("Professor, the time is:" + compTime);
	
		double seconds= compTime/1000000000;
		System.out.println("Professor, the conversion to seconds is:"+ seconds);
	}

}
