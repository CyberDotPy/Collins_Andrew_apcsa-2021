//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date - 2/2/21
//Class - Period 3
//Lab  - Unit 4 Number Verify Runner

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
	}
}