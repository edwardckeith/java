/**
 * 
 * @author Edward Keith
 * Create a program that will take in an English phrase and translate it into Pig Latin 
 * (Links to an external site). 
 * Use the link to find the rules for Pig Latin on Wikipedia. 
 * The translation must be done in its own method. 
 * The original word will be passed to this method and return the translated word back to the program.
 * The phrase will need to be split with each word being added to an array.
 * Also, add a choice for the user to decide if they want to translate another phrase after the 
 * current phrase has been completed and displayed to the user.
 * You will be using all the information that we have learned so far this semester in this program. 
 * Please take care to 
 * read the rubric to make sure you get all the concepts.
 *
 */
import textio.TextIO;

public class PigLatin 
{
	static String[] words;
	
	public static void main(String[] args) 
	{
		System.out.println("Please do not type any non alphebetical characters.");
		TextIO.put("What English phrase would you like translated to Pig Latin Sir?");
		String getPhrase= TextIO.getln();
		getTranslation(getPhrase);
		TextIO.put("Your translated phrase is "+ getTranslation(getPhrase) +". I am happy to serve you.");
	}
	public static String getTranslation (String getPhrase)
	{
		int i;
		words = getPhrase.split(" ");
		String getWordCarrier=" ";
		for(i=0;i<words.length;i++)
		{
			String first=words[i].substring(0,1).toLowerCase();
			if (first.equals("a")||first.equals("e")||first.equals("i")||first.equals("o")||first.equals("u"))
			{
				words[i]=words[i]+"yay";
			}
			else
			{
				int j;
				for(j=0;j<words[i].length();j++)
				{
					String current=words[i].substring(j,j+1).toLowerCase();
					if (current.equals("a")||current.equals("e")||current.equals("i")||current.equals("o")||current.equals("u"))
					{
						words[i]=words[i].substring(j)+words[i].substring(0,j)+"ay";
						break;
					}
				}
			}
			 getWordCarrier=getWordCarrier+" "+words[i];
		}
		getPhrase=getWordCarrier;
		return getWordCarrier;
	}

}
