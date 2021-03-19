//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variable
	private String name;
	private int size;

	//add a constructor
	public Skeleton()
	{
		name = "a";
		size = 1;
	}
	
	public Skeleton(String a, int b)
	{
		name = a;
		size = b;
	}

	//add code to implement the Monster interface
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		return this.getHowBig() > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return this.getHowBig() < other.getHowBig();

	}
	
	public boolean namesTheSame(Monster other)
	{
		return this.getName().equals(other.getName());
	}
	
	//add a toString
	public String toString()
	{
		return this.getName() + " " + this.getHowBig();
	}
}