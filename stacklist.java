
import java.util.*;

class stacklist
{

private int arr[];
private int size;
private int index1;
private int index2;

public stacklist(int size)
{
	this.size = size;
	arr= new int[size];
	index1 = -1;
	index2 = size;
}

	public boolean isEmpty1()
	{
		return index1 == -1;
	}
	
	public boolean isEmpty2()
	{
		return index2 == size;
	}
	
	
	public boolean isFull()
	{
		return index1 == index2;
	}


public void push1(int element)
{
	if(isFull())
	{
		System.out.println("TwoStack is full");
	}
	
	arr[++index1] = element;
}

public void push2(int element)
{
	if(isFull())
	{
		System.out.println("TwoStack is full");
	}
	
	arr[--index2] = element;
}


public int pop1()
{
	if(isEmpty1())
	{
		System.out.println("TwoStack is Empty");
	}
	int element = arr[index1];
	index1--;
	return element;
}

public int pop2()
{
	if(isEmpty2())
	{
		System.out.println("TwoStack is Empty");
	}
	int element = arr[index2];
	index2++;
	return element;
}

public static void main(String[] args)
{
		stacklist p = new stacklist(5);
		p.push1(5); 
		p.push2(10); 
		p.push2(15); 
		p.push1(11); 
		p.push2(40);
		
		System.out.print("Popped element from stack1 is ");
		while(!p.isEmpty1())
		{
			System.out.print(p.pop1());
			break;
		}
		
		System.out.print("\nPopped element from stack2 is ");
		while(!p.isEmpty2())
		{
			System.out.print(p.pop2());
			break;
		}
	}



}