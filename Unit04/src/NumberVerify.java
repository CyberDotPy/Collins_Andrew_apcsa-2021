//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date -   2/2/21
//Class - Period 3
//Lab  - Unit 4 Number Verify

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num % 2 == 0)
			return false;
		else
			return true;
	}
	public static boolean isEven( int num )
	{
		if (num % 2 == 0)
			return true;
		else
			return false;
	}	
}