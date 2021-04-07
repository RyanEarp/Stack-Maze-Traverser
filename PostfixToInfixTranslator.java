	package jsjf;
	import java.util.Scanner;
	import java.util.Stack;

	public class PostfixToInfixTranslator
	{
		private final static char ADD = '+';
		private final static char SUBTRACT = '-';
		private final static char MULTIPLY = '*';
		private final static char DIVIDE = '/';
		private Stack<String> stack;
		private String infix;

		public PostfixToInfixTranslator()
		{
			stack = new Stack<String>();
		}
		
		
		public String evaluate(String expr)
		{
			String op1, op2, result = "";
			String token;
			Scanner parser = new Scanner(expr);
			while (parser.hasNext())
			{
				token = parser.next();
				if (isOperator(token))
				{
					op2 = (stack.pop());
					op1 = (stack.pop());
					result = "(" + op1 + token + op2 + ")";
					stack.push(new String(result));
				}
				else
					stack.push(token);
				}
			return result;
			}
		private boolean isOperator(String token)
		{
			return ( token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
		}
	}
		