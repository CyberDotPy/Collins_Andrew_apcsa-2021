//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	
	private Dog[] pups;
	
	public Doggies(int size)
	{
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		Dog oldest = pups[0];
		
		for (int i = 0; i < pups.length; i ++)
		{
			if (pups[i].getAge() > oldest.getAge())
				oldest = pups[i];
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngest = pups[0];
		
		for (int i = 0; i < pups.length; i ++)
		{
			if (pups[i].getAge() < youngest.getAge())
				youngest = pups[i];
		}
		return youngest.getName();
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}