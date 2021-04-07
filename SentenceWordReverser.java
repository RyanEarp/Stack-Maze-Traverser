package jsjf;
import java.util.Scanner;

public class SentenceWordReverser
{
	
	public static String reverseWord(String phrase)
	{
		String[] words = phrase.split(" ");
		String backwardsString = "";
		
		for(int n = 0; n < words.length; n++)
		{
			String word = words[n];
			String backwardsWord = "";
			for(int b = word.length() - 1; b >= 0; b--)
			{
				backwardsWord = backwardsWord + word.charAt(b);
			}
			backwardsString = backwardsString + backwardsWord + " ";
		}
		return backwardsString;
	}
	public static void main(String[] args)
	{
	System.out.println("Please Enter a sentence:");
	Scanner in = new Scanner(System.in);
	String WordInput = in.nextLine();
	System.out.println("Input: "+WordInput);
	System.out.println();
	System.out.println("Reversing Each Word: " +reverseWord(WordInput));
	
	
	}
}
