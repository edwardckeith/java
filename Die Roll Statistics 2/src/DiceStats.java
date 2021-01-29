public class DiceStats 
{
   public static final int rolls = 10000;

   public static void main(String[] args) 
   {
       double average; 
       System.out.println("Total On Dice     Average Number of Rolls");
       System.out.println("____________      ________________________");
       for ( int dice = 2;  dice <= 12;  dice++ ) 
       {
          average = AverageRoll( dice );
          System.out.printf("%10d%22.4f\n", dice, average);
       }
   } 
   public static double AverageRoll( int roll ) 
   {
       int rollCount;  
       int rollTotal;  
       double averageRollCount; 
       rollTotal = 0;
       for ( int i = 0;  i < rolls;  i++ ) 
       {
          rollCount = rollFor( roll );
          rollTotal += rollCount;
       }
       averageRollCount = ((double)rollTotal) / rolls;
       return averageRollCount;
   }
   

   public static int rollFor( int N ) 
   {
	       int die1, die2;  
	       int roll;        
	       int rollCt;    
	       rollCt = 0;
       do 
       {
          die1 = (int)(Math.random()*6) + 1;
          die2 = (int)(Math.random()*6) + 1;
          roll = die1 + die2;
          rollCt++;
       } while ( roll != N );
       return rollCt;
   }
   
} 