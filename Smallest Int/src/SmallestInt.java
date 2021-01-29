/**
 * 
 * Write a subroutine with three parameters of type int. The subroutine
 *  should determine which of its parameters is smallest.
 *  The value of the smallest parameter should be returned as the value of the subroutine.
 *
 */
public class SmallestInt 
{

	static int Tiny(int a,int b,int c) 
	{
		
		if(a<b && a<c)
		{
			return a;
		}
		else if (b<a && b<c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}

}
