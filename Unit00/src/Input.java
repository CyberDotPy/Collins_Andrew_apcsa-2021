//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date - 1/28/21
//Class - Period 3
//Lab  - Unit 0 Input

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: \n");
		intTwo = keyboard.nextInt();
		
		System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter an double :: \n");
		doubleTwo = keyboard.nextDouble();
		
		System.out.print("Enter an float :: ");
		floatOne = keyboard.nextFloat();

		System.out.print("Enter an float :: \n");
		floatTwo = keyboard.nextFloat();
		
		System.out.print("Enter an short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter an short :: \n");
		shortTwo = keyboard.nextShort();


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo + "\n");
		
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo + "\n");
		
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo + "\n");
		
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo + "\n");
	}
}