package jsjf;

import java.util.Scanner;

public class PostFixtoInfixTester
{

	public static void main(String[] args)
	{
		String expression, again;
		String result;
		
		Scanner in = new Scanner(System.in);
		
		do
		{
			PostfixToInfixTranslator evaluator = new PostfixToInfixTranslator();
			System.out.println("Enter a valid post-fix expression one token" +" at a time with a space between each token " + "(e.g. 5 4 + 3 2 1 - + *)");
			System.out.println("Each token must be an integer or an " + "operator (+,-,*,/)");;
			expression = in.nextLine();
			result = evaluator.evaluate(expression);
			System.out.println();
			System.out.println("That expression translates to " + result);
			System.out.println("Evaluate another expression [Y/N]? ");
			again = in.nextLine();
			System.out.println();
			}
		while (again.equalsIgnoreCase("y"));

	}

}
