
public class DieStats 
{

			public static int roll=10000;
			
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
	
	
	}
	public static int rolls (int total)
	{
		int dice1,dice2,counter;
		int c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
		c2=0;c3=0;c4=0;c5=0;c6=0;c7=0;c8=0;c9=0;c10=0;c11=0;c12=0;
		
		for(counter=0;counter<roll;counter++)
		{
			
		dice1=(int)(Math.random()*6+1);
		dice2=(int)(Math.random()*6+1);
		
		if(dice1+dice2==2)
		{
			c2++;
		}
		if(dice1+dice2==3)
		{
			c3++;
		}
		if(dice1+dice2==4)
		{
			c4++;
		}
		if(dice1+dice2==5)
		{
			c5++;
		}
		if(dice1+dice2==6)
		{
			c6++;
		}
		if(dice1+dice2==7)
		{
			c7++;
		}
		if(dice1+dice2==8)
		{
			c8++;
		}
		if(dice1+dice2==9)
		{
			c9++;
		}
		if(dice1+dice2==10)
		{
			c10++;
		}
		if(dice1+dice2==11)
		{
			c11++;
		}
		if(dice1+dice2==12)
		{
			c12++;
		}
		return total=c2+c3+c4+c5+c6+c7+c8+c9+c10+c11+c12;
		}
	}
		
		
}
