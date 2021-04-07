package jsjf;

public class LinkedStack<T> implements StackADT<T>
{
	private int  count;
	private LinearNode<T> top;
	
	public LinkedStack()
	{
		count = 0;
		top = null;
	}

	@Override
	public void push(T element)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
