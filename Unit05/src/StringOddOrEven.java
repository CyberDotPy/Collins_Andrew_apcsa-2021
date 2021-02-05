//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String oddOrEven = "";

	public StringOddOrEven()
	{
		setString("");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		// check if length of word is even or odd
 		if (word.length() % 2 == 0) {
			oddOrEven = "even";
			return true;
		}
 		
		oddOrEven = "odd";
		return false;
	}

 	public String toString()
 	{
 		String output = word + " is " + oddOrEven + ".";
 		return output;
	}
}