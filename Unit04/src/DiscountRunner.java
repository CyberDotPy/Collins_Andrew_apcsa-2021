//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date - 2/2/21
//Class - Period 3
//Lab  - Unit 4 Discount Runner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.printf("Bill after discount :: %f", Discount.getDiscountedBill(amt));
	}
}